package com.springboot.bookcart.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.bookcart.model.Profile;
import com.springboot.bookcart.service.ProfileService;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

	private ProfileService profileService;
	
	public ProfileController(ProfileService profileService) {
		super();
	    this.profileService = profileService;			
	}
	@PostMapping("/add")
	public ResponseEntity<Profile> saveProfile(@RequestBody Profile profile){
		return new ResponseEntity<Profile>(profileService.saveProfile(profile), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Profile>> listProfile(@RequestParam("query") String query){
		return ResponseEntity.ok(profileService.listProfile(query));
	}
	
	@PutMapping("/list")
	public Profile update(@RequestBody Profile profile){
		return profileService.saveProfile(profile);
	}
	
	@PutMapping("/cards")
	public Profile updatecard(@RequestBody Profile profile){
		return profileService.saveProfile(profile);
	}
	
	
	//@GetMapping("/update")
	//public ResponseEntity<List<Profile>> updateProfile(@RequestParam("value") int value, @RequestParam("name") String name){
	//	return ResponseEntity.ok(profileService.updateProfile(value, name));
	//}
	
}
