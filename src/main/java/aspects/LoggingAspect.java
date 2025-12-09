package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component //adding this class to the spring context
@Aspect //Telling spring that this class is an aspect
public class LoggingAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    //Using the advice annotation to tell spring when and which methods to execute
    //In this case, all methods in the services package are executed,
    //And @Around is used to execute the advice before and after the method is executed
    //The ProceedingJoinPoint object represents the intercepted method
    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("Executing the method: " + joinPoint.getSignature().getName());
        joinPoint.proceed();//This is the call to the original method
        LOGGER.info("Method executed successfully");
    }
}
