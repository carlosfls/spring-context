package beans;

//there are created with the @Bean in configuration class
public class CommentService {

    public void createComment(String comment) {
        System.out.println(comment);
    }
}
