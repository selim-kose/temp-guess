package com.example.webdemo2mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.annotation.ApplicationScope;

@Controller
@ApplicationScope // Default scope
public class VisitController {

    @Autowired
    VisitCounter visitCounter;

    @GetMapping("/visit")
    public String visit(Model model){
        visitCounter.tick();
        int visits = visitCounter.getTicks();
        model.addAttribute("ticks", visits);
    return "visitpage";
    }
}
