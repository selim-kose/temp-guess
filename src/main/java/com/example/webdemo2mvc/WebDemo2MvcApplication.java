package com.example.webdemo2mvc;

import com.example.webdemo2mvc.guessApplication.service.GuessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class WebDemo2MvcApplication implements CommandLineRunner {

	@Autowired
	private GuessService guessService;

	public static void main(String[] args) {
		SpringApplication.run(WebDemo2MvcApplication.class, args);
	}



	@Override
	public void run(String... args) {
		Random random = new Random();
		int randomNumber = random.nextInt(1,101);
		System.out.println(randomNumber);
		guessService.addRandom(randomNumber);
	}
}
