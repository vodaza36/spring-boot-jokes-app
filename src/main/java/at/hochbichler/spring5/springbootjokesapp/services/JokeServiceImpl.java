package at.hochbichler.spring5.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class JokeServiceImpl implements JokeService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
