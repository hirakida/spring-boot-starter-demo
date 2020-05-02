package com.github.hirakida.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloBean.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {
    private final HelloProperties properties;

    public HelloAutoConfiguration(HelloProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    public HelloBean helloBean() {
        return new HelloBean(properties);
    }
}
