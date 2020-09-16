package link.infra.snip.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.LOCAL_VARIABLE)
public @interface SnipLocalVariable {
	String value();
	boolean includeType() default false;
	boolean fullyQualifyType() default false;
	boolean includeAssignment() default false;
}
