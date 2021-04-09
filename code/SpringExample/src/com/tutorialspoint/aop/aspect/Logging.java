package com.tutorialspoint.aop.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {

    @Pointcut("execution(* com.tutorialspoint.aop.aspect.*.*(..))")
    public void logging(){}

    @Before("logging()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("logging()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(value = "logging()",returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    @AfterThrowing(value = "logging()",throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
