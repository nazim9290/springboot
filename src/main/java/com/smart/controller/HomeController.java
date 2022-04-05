package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smart.repo.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private UserRepository repo;

	/*
	 * @GetMapping("/test")
	 * 
	 * @ResponseBody // this anotation is clled response text public String test() {
	 * User user = new User(); user.setName("nazim");
	 * user.setEmail("nazim@nazim.com"); repo.save(user); return "working"; }
	 */

	@GetMapping("")
	public String home(Model model) {

		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}

	@GetMapping("/about")
	public String about(Model model) {

		model.addAttribute("title", "about");
		return "about";
	}

	@GetMapping("/signup")
	public String signup(Model model) {

		model.addAttribute("title", "Register");
		return "signup";
	}

	@GetMapping("/login")
	public String login(Model model) {

		model.addAttribute("title", "login");
		return "login";
	}

}
