package com.example.webdemo2mvc.guessApplication.controller;

import com.example.webdemo2mvc.guessApplication.service.GuessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guess")
public class GuessController {

    @Autowired
    private GuessService guessService;

    @PostMapping("/")
    public String post(@RequestParam int guess, Model model) {
        guessService.add(guess);
        model.addAttribute("test", 1);
        model.addAttribute("previousGuess", guessService.get());
        model.addAttribute("random", guessService.getRandom());
        model.addAttribute("message", guessService.getMessage());
        return "guesspage";
    }

    @GetMapping("/")
    public String get(Model model) {

        return "guesspage";
    }
}
