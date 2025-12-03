package beans;

import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment() {
        System.out.println("Comment stored in DB");
    }
}
