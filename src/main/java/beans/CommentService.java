package beans;

import org.springframework.stereotype.Service;

//it is not a contract because it has only one way to implement the logic for the business.
@Service
public class CommentService {

    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;


    void createComment(){
        commentRepository.storeComment();
        commentNotificationProxy.sendNotification();
    }

}
