package com.fashionBackend.dao;

import java.util.List;

import com.fashionBackend.model.UserDetail;


public interface UserDetailDAO {
	public boolean addUserDetail(UserDetail userdetail);
	public boolean deleteUserDetail(UserDetail userdetail);
	public boolean updateUserDetail(UserDetail userdetail);
	public List<UserDetail> listUserDetails();
	public UserDetail getUserDetail(String username);
	public boolean registerUser(UserDetail userdetail);
}
