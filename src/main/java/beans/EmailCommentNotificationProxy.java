package beans;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendNotification() {
        System.out.println("Email sent");
    }
}
