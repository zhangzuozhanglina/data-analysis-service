package com.metu.demo2.sys;

import com.jhd.ns.model.response.SalesOrderResponse;
import com.jhd.ns.model.response.ServiceCommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName ServiceExcepHandler
 * @Description TODO
 * @Author admin
 * @Date 2019/12/9 14:41
 * @Version 1.0
 **/
@Configuration
@Component
@Aspect
@Slf4j
public class ServiceExcepHandler {
    @Around("@annotation(com.jhd.ns.annotation.ServiceCatch)  || @within(com.jhd.ns.annotation.ServiceCatch)")
    public Object serviceExcepHandler(ProceedingJoinPoint proceedingJoinPoint) {
        log.error("当前类"+proceedingJoinPoint.getClass().getName());
        Object result =null;
        try {
           result= proceedingJoinPoint.proceed();

            if(result instanceof  ServiceCommonResponse) {
               ServiceCommonResponse commonResponse= new ServiceCommonResponse();
               commonResponse.setStatus("ERROR");
                return commonResponse;
            }
            else {
                SalesOrderResponse salesOrderResponse = new SalesOrderResponse();
                salesOrderResponse.setStatus("ERROR");
            }

        } catch (Throwable throwable) {
            log.error("ServiceExcepHandler serviceExcepHandler failed", throwable);
           // returnMsg.setError(BaseErrorEnum.SYS_ERROR_UNKNOW);
        }
        return result;
    }
}
