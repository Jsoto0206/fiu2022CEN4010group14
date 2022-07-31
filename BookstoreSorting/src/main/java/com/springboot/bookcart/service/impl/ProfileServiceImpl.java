package com.springboot.bookcart.service.impl;

import java.util.List;
import com.springboot.bookcart.model.Profile;
import com.springboot.bookcart.repo.profileRepo;
import com.springboot.bookcart.service.ProfileService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.repo.bookRepo;
import com.springboot.bookcart.service.BookService;

@Service
public class ProfileServiceImpl implements ProfileService{

	private profileRepo Profileerepo;
	
	public ProfileServiceImpl(profileRepo Profileerepo) {
		super();
		this.Profileerepo = Profileerepo;
	}
	
	
	@Override
	public Profile saveProfile(Profile profile) {
		return Profileerepo.save(profile);
	}

//	@Override
	//public List<Profile> updateProfile(int value, String name) {
	//	return null;
		//int Profiles = Profileerepo.updateProfile(value , name);
		//return Profiles;
		//return null;
	//}

	public List<Profile> listProfile(String query) {
		List<Profile> profile = Profileerepo.listProfile(query);
		return profile;
	}



	
}
