package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(* components.TargetComponent.targetMethod(..))")
//    public void before() {
//        System.out.println("BEFORE ADVICE");
//    }
//
//    @AfterReturning("execution(* components.TargetComponent.targetMethod(..))")
//    public void afterReturning() {
//        System.out.println("AFTER RETURNING ADVICE");
//    }
//
//    @AfterThrowing("execution(* components.TargetComponent.targetMethod(..))")
//    public void afterThrowing() {
//        System.out.println("AFTER THROWING ADVICE");
//    }
//
//    @After("execution(* components.TargetComponent.targetMethod(..))")
//    public void after() {
//        System.out.println("AFTER ADVICE");
//    }

    @Around("execution(* components.TargetComponent.targetMethod(..))")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("EXECUTING BEFORE THE TARGET METHOD");
        try {
            joinPoint.proceed();
            System.out.println("EXECUTING IF NO EXCEPTION IS THROWN");
        } catch (Throwable t) {
            System.out.println("EXECUTING IF AN EXCEPTION IS THROWN");
        } finally {
            System.out.println("EXECUTING AFTER THE TARGET METHOD");
        }
    }
}
