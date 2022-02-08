package guru.springframework.springbootjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.springbootjokesapp.services.JokeService;

@Controller
public class JokeController {
	
	private final JokeService jokeService;
	
	

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}



	@RequestMapping({"/",""})
	public String getJokes(Model model)
	{
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
	
	
	
}
