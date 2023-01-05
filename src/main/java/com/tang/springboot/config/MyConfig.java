package com.tang.springboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.tang.springboot.bean.Car;
import com.tang.springboot.bean.Pet;
import com.tang.springboot.bean.User;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;
import org.springframework.boot.web.servlet.server.Encoding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @Classname MyConfig
 * @Description TODO
 * @Date 2022/3/19 11:09 下午
 * @Author by tangyao
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false)
//@ConditionalOnBean(name = "tomcatPet")
@ImportResource("classpath:beans.xml")
@ConditionalOnMissingBean(name = "tomcatPet")
@EnableConfigurationProperties(Car.class)
//1、开启Car配置绑定功能
//2、把这个Car这个组件自动注册到容器中
public class MyConfig {

//    @ConditionalOnBean(name = "tomcatPet")
    @Bean
    public User user01() {


        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setPet(tomcatPet());
        return user;
    }


    @Bean("tom2")
    public Pet tomcatPet() {
        return new Pet("tom", 6.00);
    }

//    @Bean
//    public CharacterEncodingFilter characterEncodingFilter() {
//        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
//
//        return filter;
//    }

}
