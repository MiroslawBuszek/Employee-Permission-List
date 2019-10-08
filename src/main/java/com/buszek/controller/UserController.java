package com.buszek.controller;

import com.buszek.LoginForm;
import com.buszek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
    private UserRepository repository;
	
    @RequestMapping(value = "signup")
    public String addStudent(Model model){
    	model.addAttribute("signupform", new LoginForm());
        return "signup";
    }	
    
//    @RequestMapping(value = "saveuser", method = RequestMethod.POST)
//    public String save(@Valid @ModelAttribute("signupform") LoginForm loginForm, BindingResult bindingResult) {
//    	System.out.println(bindingResult.toString());
//    	if (!bindingResult.hasErrors()) { // validation errors
//    		if (loginForm.getPassword().equals(loginForm.getPasswordCheck())) { // check password match
////	    		String pwd = loginForm.getPassword();
////		    	BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
////		    	String hashPwd = bc.encode(pwd);
//
//		    	User newUser = new User();
////		    	newUser.setPasswordHash(hashPwd);
//		    	newUser.setUsername(loginForm.getUsername());
//		    	newUser.setRole("USER");
//		    	if (repository.findByUsername(loginForm.getUsername()) == null) {
//		    		repository.save(newUser);
//		    	}
//		    	else {
//	    			bindingResult.rejectValue("username", "error.userexists", "Username already exists");
//	    			return "signup";
//		    	}
//    		}
//    		else {
//    			bindingResult.rejectValue("passwordCheck", "error.pwdmatch", "Passwords does not match");
//    			return "signup";
//    		}
//    	}
//    	else {
//    		return "signup";
//    	}
//    	return "redirect:/login";
//    }
    
}
