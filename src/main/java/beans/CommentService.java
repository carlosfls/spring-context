package beans;

import org.springframework.stereotype.Service;

//it is not a contract because it has only one way to implement the logic for the business.
@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void createComment(){
        commentRepository.storeComment();
        commentNotificationProxy.sendNotification();
    }

}
