package com.example.webdemo2mvc.guessApplication.service;

import com.example.webdemo2mvc.guessApplication.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GuessService {

    @Autowired
    Repository repository;

    private Random random = new Random();
    private int randomNr;
    String message;

    public void add(int guess) {
        repository.addGuess(guess);
        if (random == null) {
            randomNr = random.nextInt(1, 101);
        }
        if(guess > randomNr){
            message = "to high!";

        }else if(guess < randomNr) {
            message = "to low!";

        }else{
            repository.clear();
            message = "You won!";
            randomNr = random.nextInt(1,101);
        }

    }

    public List<Integer> get() {
        return repository.getGuesses();
    }

    public void addRandom(int number) {
        this.randomNr = number;
    }

    public int getRandom() {
        return this.randomNr;
    }

    public String getMessage(){
        return message;
    }
}
