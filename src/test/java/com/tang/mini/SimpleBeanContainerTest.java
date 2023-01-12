package com.tang.mini;

import com.tang.mini.ioc.BeanFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Classname SimpleBeanContainerTest
 * @Description
 * @Date 2023/1/11 23:34
 * @Author by tangyao
 */
public class SimpleBeanContainerTest {

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }


    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
//        assertThat();

    }
}
