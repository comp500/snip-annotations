package link.infra.snip.annotations;

import java.lang.annotation.*;

// TODO: what targets should this have?

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.PACKAGE, ElementType.METHOD})
@Repeatable(SnipClassReferences.class)
public @interface SnipClassReference {
	Class<?> ref();
	String label();
}
