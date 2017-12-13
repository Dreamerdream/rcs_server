package com.juphoon.rcsrunner.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description: 获取ApplicationContext
 */
@Component
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.context = applicationContext;
    }
    public static ApplicationContext getContext(){
        return context;
    }

}
