package ru.ukrainskiy.rnd.useaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CommentServiceAspect {

    private final Logger logger = Logger.getLogger(CommentServiceAspect.class.getName());

    @Around("@annotation(ToLog)")
    public void logCommentService(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Aspect before !!!");
        joinPoint.proceed();
        logger.info("Aspect after !!!");
    }
}
