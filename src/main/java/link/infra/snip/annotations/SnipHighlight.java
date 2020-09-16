package link.infra.snip.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({})
@Repeatable(SnipHighlights.class)
public @interface SnipHighlight {
	String[] value();
}
