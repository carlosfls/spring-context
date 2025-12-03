package beans;

import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendNotification() {
        System.out.println("Email sent");
    }
}
