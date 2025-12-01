import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    /**
     * @Bean annotation is used for creating beans for adding them to the spring context
     * @Component etc. is another way of creating beans and adding them to the context
     */
    public static void main(String[] args) {
        //spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


    }
}
