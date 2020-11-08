package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class GreetingService {

    public GreetingService() {
        System.out.println("create GreetingService");
    }

    String sayHi() {
        return "hello world";
    }
}
