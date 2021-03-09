package com.nextcode.bulletin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@EnableAutoConfiguration
@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public void home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Readre!");
    }

    //    @GetMapping("/login-error")
    @RequestMapping(value = "/sessionValue", method = RequestMethod.GET)
    public void test(Map<String, Object> model) {

        model.put("message", "HowToDoInJava Readre!");

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void login() {

    }
}
