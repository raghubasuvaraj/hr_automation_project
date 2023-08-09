package com.example.hobbie.atpsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class OeaRegController {

	@GetMapping("/oeareg")
	public String register() {
		return "/oea_reg/register";
	}
}
