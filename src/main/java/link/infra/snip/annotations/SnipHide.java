package link.infra.snip.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// TODO: which things should this be on?
@Retention(RetentionPolicy.SOURCE)
public @interface SnipHide {
	/**
	 * @return A string containing the comment to replace the hidden code with, can be "" to not add a comment
	 */
	String comment() default "";
}
