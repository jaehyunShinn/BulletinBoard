package com.nextcode.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class) ;
    }
//        SpringApplication.run(SpringBootWebApplication.class, args);
//        ApplicationScope01 obj1 = new ApplicationScope01();
//        ApplicationScope02 obj2 = new ApplicationScope02();
//        HttpServletRequest h1 = new HttpServletRequest();
//        obj1.doGet();
//        obj2.doGet();
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);

    }
//    @com.nextcode.board.RefreshScope
//    @RestController
//    class MessageRestController {
//
//        @Value("${message:Hello default}")
//        private String message;
//
//        @RequestMapping("/message")
//        String getMessage() {
//            return this.message;
//        }
//    @GetMapping("/hello")
//    public String sayHello(@RequestParam())
}
