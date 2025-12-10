package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Creating the annotation the aspect will use,
 * The RUNTIME policy is used to make the annotation available at runtime, for the aspect to be able to access it.
 * The target is which places the annotation can be used (in this case, methods)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ToLog {
}
