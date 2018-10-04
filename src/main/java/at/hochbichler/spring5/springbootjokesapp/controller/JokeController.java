package at.hochbichler.spring5.springbootjokesapp.controller;

import at.hochbichler.spring5.springbootjokesapp.services.JokeService;
import at.hochbichler.spring5.springbootjokesapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String retrieveJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
