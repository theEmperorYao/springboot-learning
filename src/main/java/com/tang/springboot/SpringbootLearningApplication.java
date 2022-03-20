package com.tang.springboot;

import ch.qos.logback.core.db.DBHelper;
import com.tang.springboot.bean.Pet;
import com.tang.springboot.bean.User;
import com.tang.springboot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootLearningApplication {

    public static void main(String[] args) {
        // 返回我们的ioc容器
        ApplicationContext run = SpringApplication.run(SpringbootLearningApplication.class, args);
        // 查看我们的组件
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//        Pet tomcatPet = run.getBean("tomcatPet", Pet.class);
//        Pet tomcatPet2 = run.getBean("tomcatPet", Pet.class);
//        System.out.println("组件:" + (tomcatPet == tomcatPet2));
//
//        MyConfig config = run.getBean(MyConfig.class);
//        System.out.println("config = " + config);
//        User user = config.user01();
//        User user2 = config.user01();
//        System.out.println("user==user2 = " + (user == user2));
//
//        User user01 = (User) run.getBean("user01");
//
//        System.out.println("user01 = " + user01);
//
//        Pet tomcatPet1 = (Pet) run.getBean("tomcatPet");
//        System.out.println("tomcatPet1 = " + tomcatPet1);
//
//        System.out.println("(user01.getPet() ==  tomcatPet1) = " + (user01.getPet() == tomcatPet1));
//
//        System.out.println("===================");
//        for (String s : run.getBeanNamesForType(User.class)) {
//            System.out.println("s = " + s);
//        }
//        DBHelper bean = run.getBean(DBHelper.class);
//        System.out.println("bean = " + bean);

        boolean tomcatPet = run.containsBean("tomcatPet");
        System.out.println("容器中Tom组件：" + tomcatPet);
        boolean user01 = run.containsBean("user01");
        System.out.println("user01 = " + user01);

        boolean haha = run.containsBean("haha");
        System.out.println("haha = " + haha);
        boolean hehe = run.containsBean("hehe");
        System.out.println("hehe = " + hehe);


    }

}
