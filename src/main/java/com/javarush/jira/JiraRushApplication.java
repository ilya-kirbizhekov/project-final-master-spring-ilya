package com.javarush.jira;

import com.javarush.jira.common.internal.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import com.javarush.jira.common.internal.config.MachineConfig;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties({AppProperties.class})

@EnableCaching
public class JiraRushApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context  = SpringApplication.run(JiraRushApplication.class, args);

        MachineConfig myComponent = context.getBean(MachineConfig.class);

        System.out.println(myComponent.getDataBaseLogin());
        System.out.println(myComponent.getDataBasePassword());
        System.out.println(myComponent.getMailHost());
        System.out.println(myComponent.getMailUserName());
        System.out.println(myComponent.getMailPassword());

    }
}
