package com.cx.springboot.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cx.springboot.domain.User;
import com.cx.springboot.domain.UserRepository;

/**
 * 提供Demo服务类.
 * 
 * @author Administrator
 *
 */
@Service
public class UserService {

	@Resource
	private UserRepository userRepository;

	@Transactional
	public void save(User user) {
		userRepository.save(user);
	}
	
	public List<User> getUserByName(String name){
		return userRepository.getUser(name);
	}

}