package ru.ukrainskiy.rnd.useaspect;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText() + " author " + comment.getAuthor());
    }
}
