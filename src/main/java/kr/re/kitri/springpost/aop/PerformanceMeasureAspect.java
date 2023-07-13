package kr.re.kitri.springpost.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PerformanceMeasureAspect {


    //Around는 Before과는 다르게 ProceedingJoinPoint를 받는다.
    @Around("execution(* kr.re.kitri.springpost.service.*Service.*(..))")
    public Object performanceMeasure(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = pjp.proceed();
        long end = System.currentTimeMillis();

        log.debug(pjp.getSignature().getName()+ " 함수의 실행 시간은 " + (end - start) + "ms 입니다.");
        return result;
    }
}
