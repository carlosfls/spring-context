package services;

import annotations.ToLog;
import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private static final Logger LOGGER = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        LOGGER.info("Publishing comment: " + comment.getText());
    }

    /**
     * This method is annotated with @ToLog, so it will be logged by the LoggingAspect
     */
    @ToLog
    public void deleteComment(Comment comment) {
        LOGGER.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment) {
        LOGGER.info("Editing comment: " + comment.getText());
    }
}
