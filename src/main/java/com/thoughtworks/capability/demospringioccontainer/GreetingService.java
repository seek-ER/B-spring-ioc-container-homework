package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class GreetingService {

    public GreetingService() {
        System.out.println("GreetingService created");
    }

    String sayHi() {
        return "hello world";
    }
}
