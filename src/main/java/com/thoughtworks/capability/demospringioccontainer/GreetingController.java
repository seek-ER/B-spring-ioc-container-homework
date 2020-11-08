package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private ObjectFactory<GreetingService> greetingServiceObjectFactory;

    @GetMapping("/greet")
    public String greet() {
        return greetingServiceObjectFactory.getObject().sayHi();
    }

}
