package springstart.ch6_ex1.services;

import org.springframework.stereotype.Service;
import springstart.ch6_ex1.model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing Comment: " + comment.getText());
    }
}
