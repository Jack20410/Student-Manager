package com.tdtu.studentmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String showHomepage() {
        System.out.println("Welcome");
        return "index";
    }
}
