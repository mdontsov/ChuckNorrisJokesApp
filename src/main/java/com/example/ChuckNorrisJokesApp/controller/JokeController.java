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
    * Model attribute name must match the thymeleaf attribute name th:text="${...}"
    * Adds JokeService text to 'joke' property of Model
    * Finally, maps the model with invoked joke service to Thymeleaf form and return it
    * */
    @GetMapping("/")
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getNewJoke());
        return "chucknorris";
    }
}
