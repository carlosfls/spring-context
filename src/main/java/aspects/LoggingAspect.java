package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Order(2)
@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    /**
     * This method will be executed around every method annotated with @ToLog annotation
     * Important: If the annotation is in a different package,
     * Them you must use the annotation package and the annotation name in the @Around annotation
     */
    @Around("@annotation(annotations.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("Executing the method: " + joinPoint.getSignature().getName());
        Object response = joinPoint.proceed();
        LOGGER.info("Method executed successfully");
        return response;
    }
}
