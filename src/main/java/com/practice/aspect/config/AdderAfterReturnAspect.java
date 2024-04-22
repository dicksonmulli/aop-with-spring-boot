package com.practice.aspect.config;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdderAfterReturnAspect {

    private final Logger logger = LoggerFactory.getLogger(AdderAfterReturnAspect.class);

    @Pointcut("execution(* com.practice.aspect.domain.SampleAdder+.*(..))")
    public void pointCutAfterReturning() {
    }

    @AfterReturning(
            pointcut = "pointCutAfterReturning()",
            returning = "returnValue")
    public void afterReturn(Object returnValue) throws Throwable {
        logger.error("Value returned was: " + returnValue);
    }
}
