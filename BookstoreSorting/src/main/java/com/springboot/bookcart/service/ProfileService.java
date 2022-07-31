package com.springboot.bookcart.service;

import java.util.List;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Profile;

public interface ProfileService {
Profile saveProfile(Profile profile);
List<Profile> listProfile(String profile);
//List<Profile> updateProfile(int value, String name);
}
