package com.example.ChuckNorrisJokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    // Invocation of a class that returns the random jokes
    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getNewJoke() {
        return quotes.getRandomQuote();
    }
}
