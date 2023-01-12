package com.tang.mini.ioc;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname BeanFactory
 * @Description
 * @Date 2023/1/11 23:32
 * @Author by tangyao
 */
public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
