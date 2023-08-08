package com.example.hobbie.atpsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OeaPassController {
	@GetMapping("/password")
public String Password() {
	return "oea_pass/password.html";
}
}
