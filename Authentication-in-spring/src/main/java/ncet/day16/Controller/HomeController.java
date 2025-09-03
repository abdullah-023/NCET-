package ncet.day16.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HomeController {
 
	@GetMapping("/")
	public String home() {
		return "Welcome to the public home page!";
	}
 
	@GetMapping("/user")
	public String userPage() {
		return "Welcome, USER!";
	}
 
	@GetMapping("/admin")
	public String adminPage() {
		return "Welcome, ADMIN!";
	}
}
