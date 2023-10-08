package com.fdemo.fdemo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * AOP 动态代理
 */
@Component
@Slf4j
@Aspect
public class TimeAspect {

    @Around("execution(* com.fdemo.fdemo.service.*.*(..))") //切入点表达式
    public Object recordTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 1, 开始时间
        long begin = System.currentTimeMillis();
        // 2, 调用原始方法执行
        Object proceed = proceedingJoinPoint.proceed();
        // 3， 结束时间
        long end = System.currentTimeMillis();

        log.info(proceedingJoinPoint.getSignature() + "方法耗时: {}ms", begin - end);
        return proceed;
    }
}
