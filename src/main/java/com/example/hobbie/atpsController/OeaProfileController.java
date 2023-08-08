package com.example.hobbie.atpsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OeaProfileController {
@GetMapping("/profile")
public String Prof() {
	return "oea_profile/profile";
}
}
