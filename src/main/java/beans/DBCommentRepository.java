package beans;

import entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment stored in DB");
    }
}
