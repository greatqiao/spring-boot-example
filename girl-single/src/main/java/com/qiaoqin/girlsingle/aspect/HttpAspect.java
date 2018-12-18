package com.qiaoqin.girlsingle.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class HttpAspect {

    //使用spring的slf4的logger
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut(value = "execution(public * com.qiaoqin.girlsingle.controller.GirlController.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();

        logger.info("url = {}",httpServletRequest.getRequestURL());

        logger.info("method={}",httpServletRequest.getMethod());

        logger.info("ip = {}",httpServletRequest.getRemoteAddr());

        logger.info("class_method = {}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        logger.info("args={}",joinPoint.getArgs());
    }


    @After("log()")
    public void doAfter(){
        logger.info("test");
        logger.info("22222222");
    }
}
