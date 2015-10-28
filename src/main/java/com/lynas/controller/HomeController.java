package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LynAs on 28-Oct-15.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        System.out.println("hello world");
        return "home";
    }
}
