package com.github.hirakida.spring.boot;

public class HelloBean {
    private static final String DEFAULT_MESSAGE = "Hello, spring boot!";
    private final HelloProperties properties;

    public HelloBean(HelloProperties properties) {
        this.properties = properties;
    }

    public String getMessage() {
        return properties.getMessage() != null ? properties.getMessage() : DEFAULT_MESSAGE;
    }
}
