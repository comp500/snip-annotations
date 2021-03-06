package link.infra.snip.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({})
public @interface SnipExcludes {
	SnipExclude[] value();
}
