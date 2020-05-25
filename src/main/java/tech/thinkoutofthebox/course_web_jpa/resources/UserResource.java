package tech.thinkoutofthebox.course_web_jpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.thinkoutofthebox.course_web_jpa.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "1234");
		return ResponseEntity.ok().body(u);
	}
	/*
	@GetMapping
	public ResponseEntity<String> Echo(){
		return ResponseEntity.ok().body("Renato!");
	}
	*/
}
