package com.example.ChuckNorrisJokesApp.controller;

import com.example.ChuckNorrisJokesApp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    /*
    * Spring attribute name must match the thymeleaf attribute name th:text="${...}"
    * Adds JokeService text to 'joke' property of Model
    * */
    @GetMapping("/")
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getNewJoke());
        return "chucknorris";
    }
}
