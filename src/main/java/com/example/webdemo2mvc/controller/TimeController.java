package com.example.webdemo2mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class TimeController {
    @GetMapping("/time")
    public String getTime(Model model) {
        model.addAttribute("timeString", LocalDateTime.now());
        return "timepage";
    }
}
