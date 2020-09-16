package link.infra.snip.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// TODO: what targets should this have?

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.PACKAGE, ElementType.METHOD})
public @interface SnipClassReferences {
	SnipClassReference[] value();
}
