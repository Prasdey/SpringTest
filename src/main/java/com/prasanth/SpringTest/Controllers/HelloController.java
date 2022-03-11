package com.prasanth.SpringTest.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "User") String name) {
        return String.format("Hello %s, welcome to the Spring boot Application! ", name);

    }
}
