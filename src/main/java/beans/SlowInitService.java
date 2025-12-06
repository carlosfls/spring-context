package beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Example using @Lazy init for the beans is very util if you need to init the bean before the context creation
 * and only when is needed.
 * In the default case when spring creates the context it inits all the bean for the project
 * If you add @Lazy over the bean spring init the bean if needed not when the app starts.
 */
@Service
@Lazy
public class SlowInitService {

    public SlowInitService() {
        System.out.println("Creating the service...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Service created.");
    }
}
