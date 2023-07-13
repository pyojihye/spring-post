package kr.re.kitri.springpost.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


    //시작, 끝날때 찍음(Around), Before랑 Around 많이 씀
    //@Around("execution(* kr.re.kitri.springpost.service.PostService.*(..))")
    /*public Object logging(ProceedingJoinPoint pjp) throws Throwable{
        logger.info("start - " + pjp.getSignature().getDeclaringTypeName() + "/" + pjp.getSignature().getName());
        Object result = pjp.proceed();
        logger.info("finished - " + pjp.getSignature().getDeclaringTypeName() + "/" + pjp.getSignature().getName());
        return result;
    }*/

    @Before("execution(* kr.re.kitri.springpost.service.PostService.*(..))")
    public void logging(JoinPoint jp) throws Throwable{
        String methodName = jp.getSignature().getName();    //호출되는 파일 위치 이름
        String className = jp.getTarget().getClass().getName();  //호출되는 메소드 이름

        log.debug(className + "." + methodName + " 함수에서 로그를 남깁니다.");
    }

    @Before("execution(* kr.re.kitri.springpost.service.PostService.*(..))")
    public void doLogging(){
        log.debug("로그를 남깁니다.");
    }
}
