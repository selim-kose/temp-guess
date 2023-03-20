package com.example.webdemo2mvc.guessApplication.repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Repository {

    private List<Integer> guesses = new ArrayList<>();

    public void addGuess(int guess){
        guesses.add(guess);
    }
    public List<Integer> getGuesses(){
        return this.guesses;
    }
    public void clear() {
        this.guesses.clear();
    }
}
