package com.example.webdemo2mvc.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {

    public int add(int a, int b){
        return a+b;
    }
}
