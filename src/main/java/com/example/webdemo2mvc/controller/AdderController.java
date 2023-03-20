package com.example.webdemo2mvc.controller;

import com.example.webdemo2mvc.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdderController {

    @Autowired
    private AddService addService;

    @GetMapping("/add")
    public String addForm(){

        return "addresult";
    }
//
//    @GetMapping("/add/{tal1}/{tal2}")
//    public String add3(@PathVariable int tal1, @PathVariable int tal2, Model model) {
//        model.addAttribute("summa", addService.add(tal1,tal2));
//        return "addresult";
//    }


    @PostMapping("/add")
    public String add(@RequestParam int i, @RequestParam int j, Model model){
        model.addAttribute("summa",addService.add(i,i));
        return "addresult";

    }
}
