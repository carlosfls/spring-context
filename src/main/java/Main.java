import beans.CommentService;
import config.ProjectConfig;
import entity.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment("Test comment");

        commentService.createComment(comment);
    }
}
