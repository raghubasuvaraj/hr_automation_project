package com.example.hobbie.atpsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OeaDashboardController {
@GetMapping("/oeadash")
public String Dashboard() {
	return "oea_dashboard/dashboard";
}
}
