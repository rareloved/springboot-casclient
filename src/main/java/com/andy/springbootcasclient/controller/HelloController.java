package com.andy.springbootcasclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * DeputeUser: andy
 * Date: 2018/11/2
 * Time: 16:48
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("name", name);
        model.addAttribute("realName", "这是真实姓名");
        return "hello";
    }
}
