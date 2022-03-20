package com.tang.springboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.tang.springboot.bean.Pet;
import com.tang.springboot.bean.User;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

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

}
