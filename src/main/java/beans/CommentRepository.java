package beans;

import entity.Comment;

//it is a contract because has several ways to store comments
public interface CommentRepository {

    void storeComment(Comment comment);
}
