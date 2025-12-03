package beans;

import entity.Comment;

//it is a contract because has several ways to send notifications
public interface CommentNotificationProxy {

    void sendNotification(Comment comment);
}
