package link.infra.snip.annotations;

import java.io.ObjectOutputStream;
import java.util.function.Function;

// +snip startOfTheClass
@SnipNamespace("/tutorials/testing")
public class Test {
	@SnipMethod("notBad")
	public static void goodMethod() {
		// +snip goodCode
		 System.out.println("good");
		// -snip goodCode

		@SnipLocalVariable(value = "stringy", includeAssignment = true, includeType = true)
		String a = "hello" + "there";

		// +snip badCode
		System.out.println("bad");
		// -snip badCode
	}
	// -snip startOfTheClass

	// TODO: should SnipClass also define a namespace?
	@SnipClass("constructors")
	@SnipClassReference(ref = ObjectOutputStream.class, label = "serializationOutputStream")
	public class ConstructorTest {
		@SnipMethod("alsoWorksOnConstructors")
		public ConstructorTest() {
			// Hello yes I am a constructor
		}
	}

	@Deprecated
	@SnipMethod(value = "deprecationExample", showAnnotations = false)
	public static void hideDeprecation() {
		System.out.println("You should use a logger!");
	}

	// TODO: not sure which of these would be best

	@SnipHide
	private static class ReferenceThings {
		@SnipMethodReference
		private static final Function<Object, String> makesItAString = Object::toString;
		@SnipFieldReference
		private static final double circlesNumber = Math.PI;
	}

	@SnipHide
	private static void referenceThings() {
		@SnipMethodReference
		Function<Object, String> makesItAString = Object::toString;
		@SnipFieldReference
		double circlesNumber = Math.PI;
	}
}
