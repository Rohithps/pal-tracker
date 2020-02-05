package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private String message;
    @GetMapping(path = "/Hello")
    public String sayHello()  {
         return "A welcome message";
    }
    @GetMapping("/")
    public String sayHelloFromParam(@Value("${welcome.message}") String message)  {
        this.message = message;
        return message;
    }

}