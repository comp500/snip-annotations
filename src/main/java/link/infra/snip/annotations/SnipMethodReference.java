package link.infra.snip.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// TODO: revise
@Retention(RetentionPolicy.SOURCE)
public @interface SnipMethodReference {
	boolean includeClass() default false;
	boolean fullyQualifyClass() default false;
}
