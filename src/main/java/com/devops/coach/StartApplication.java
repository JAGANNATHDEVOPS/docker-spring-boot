package com.devops.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Hello RITU, BIRU BHAI from Software Sculpture, PLEASE INCREASE OUR SUBSCRIBERS !!!! ");
        model.addAttribute("msg", "THEN WE WILL BE MOTIVATED TO UPLOAD MORE VIDEOS");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
