package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * We create a new aspect that will intercept all methods annotated with @ToLog annotation
 * Now we have two aspects, one for logging and one for authorization,
 * We need to define the order of execution, so the security aspect will be executed before the logging aspect
 * For that we use the @Order annotation.
 */
@Order(1)
@Aspect
@Component
public class SecurityAspect {

    private static final Logger LOGGER = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(annotations.ToLog)")
    public Object authorize(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("Authorizing the method: " + joinPoint.getSignature().getName());
        Object response = joinPoint.proceed();
        LOGGER.info("User successfully authorized");
        return response;
    }
}
