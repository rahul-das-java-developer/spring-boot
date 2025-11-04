package spring.boot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@GetMapping("/welcome")
	public String welcomePage() {
		String str = "WELCOME TO OUR WEBPAGE(GetMapping)";
		System.out.println(str);
		return str;
	}

	@PostMapping("/home")
	public String homePage() {
		String str = "WELCOME TO OUR WEBPAGE(PostMapping)";
		System.out.println(str);
		return str;
	}

	@PutMapping("/cart")
	public String cartPage() {
		String str = "WELCOME TO OUR WEBPAGE(PutMapping)";
		System.out.println(str);
		return str;
	}

	@DeleteMapping("/wishlist")
	public String wishlistPage() {
		String str = "WELCOME TO OUR WEBPAGE(DeleteMapping)";
		System.out.println(str);
		return str;
	}

}
