package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beenOperation() {
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation beenOperationOperation() {
        return new MyOperationImplement();
    }
    @Bean
    public MyBeanWithDependency beenOperationOperationWithDependency(MyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
