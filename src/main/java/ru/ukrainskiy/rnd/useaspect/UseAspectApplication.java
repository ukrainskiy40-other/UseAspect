package ru.ukrainskiy.rnd.useaspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UseAspectApplication {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");
        //Test aspect
        service.publishComment(comment);
    }

}
