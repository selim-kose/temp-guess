package com.example.webdemo2mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class VisitCounter {

    int ticks;

    public void tick() {
        ticks++;
    }

    public int getTicks() {
        return ticks;
    }
}
