package link.infra.snip.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface SnipClass {
	String value();
	boolean showAnnotations() default true;
	boolean includeImports() default false;
	SnipExclude exclude() default @SnipExclude({});
	SnipHighlight highlight() default @SnipHighlight({});
}
