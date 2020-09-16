package link.infra.snip.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({})
@Repeatable(SnipExcludes.class)
public @interface SnipExclude {
	String[] value();
	/**
	 * @return A string containing the comment to replace the excluded snippets with, can be "" to not add a comment
	 */
	String comment() default "...";
}
