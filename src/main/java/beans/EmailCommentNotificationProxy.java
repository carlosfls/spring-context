package beans;

import entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendNotification(Comment comment) {
        System.out.println("Email sent");
    }
}
