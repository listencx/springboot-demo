package com.demo.jly.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jly.model.User;
import com.demo.jly.service.UserService;

@RestController
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping(value="/save/{info}",method = RequestMethod.GET)
	public String saveUser(@PathVariable("info")String info){
		String[] user1 = info.split("&");
		User user = new User();
		List<User> users=userService.getUserByName(user1[0]);
		if(users.size()>0){
			return "EXIST";
		}
		else{
			try {
				user.setUsersName(user1[0]);
				user.setUsersPass(user1[1]);
				userService.save(user);
				return "SUCESS";
			} catch (Exception e) {
				e.printStackTrace();
				return "DEFAULT";
			}
		}
	}
	@RequestMapping(value="/check/{name}",method = RequestMethod.GET)
	public String checkUser(@PathVariable("name")String name){
		List<User> users = userService.getUserByName(name);
		if(users.size()<1){
			return "不存在";
		}
		else{
			String pass = users.get(0).getUsersPass();
			return pass;
		}
	}
	
}
