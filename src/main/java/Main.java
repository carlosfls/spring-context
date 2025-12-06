import beans.CommentService;
import beans.SlowInitService;
import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    /**
     * Proving singleton bean scope the variables are the same object in singleton pattern
     * The c1 y c2 is referring to the same instance of CommentService because spring creates the instance
     */
    public static void main(String[] args) {
        //spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(":)");

        var c1 = context.getBean("commentService", CommentService.class);
        var c2 = context.getBean("commentService", CommentService.class);

        //spring init the bean in here because is lazy not affecting the context creation and the other beans
        var c3 = context.getBean(SlowInitService.class);

        //same bean only 1 instance using singleton for creating the beans for default
        System.out.println(c1==c2);

    }
}
