package com.dz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class StudentController {

    @RequestMapping(value = "index")
    public String homeController(ModelMap modelMap) {
        modelMap.addAttribute("message", "love you ");
        return "index";
    }


}
