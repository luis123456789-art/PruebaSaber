package com.pruebaSaber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.pruebaSaber.entity.User;
import com.pruebaSaber.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "users")
public class UserWebController {

	@Autowired
	private UserRepository userRepository;

	@ModelAttribute("user")
	public User userModel() {
		return new User();
	}

	@GetMapping("/")
    public String UserListTemplate(Model model, HttpSession session) {
        if (session.getAttribute("isUser") != null) {
            String userId = session.getAttribute("userId").toString();
            User user = userRepository.findById(userId).orElse(null);
            
            if (user != null) {
                model.addAttribute("user", user);
                return "user";
            }
        }
        
        return "index";
    }
	}


