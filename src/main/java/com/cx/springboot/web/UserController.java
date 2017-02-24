package com.cx.springboot.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cx.springboot.domain.User;
import com.cx.springboot.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/save/{info}", method = RequestMethod.POST)
	public String saveUser(@PathVariable("info") String info) {
		String[] user1 = info.split("&");
		User user = new User();
		List<User> users = userService.getUserByName(user1[0]);
		if (users.size() > 0) {
			return "EXIST";
		} else {
			try {
				user.setUsersName(user1[0]);
				user.setUsersPass(user1[1]);
				userService.save(user);
				return "SUCCESS";
			} catch (Exception e) {
				e.printStackTrace();
				return "FAIL";
			}
		}
	}

	@RequestMapping(value="/{name}",method=RequestMethod.DELETE)
	public String deleteUser(String name) {
		try {
			userService.deleteByName(name);
			return "SUCCESS";
		} catch (Exception e) {
			e.printStackTrace();
			return "FAIL";
		}
		
	}
	@RequestMapping(value = "/check/{name}", method = RequestMethod.GET)
	public String checkUser(String name) {
		List<User> users = userService.getUserByName(name);
		if (users.size() < 1) {
			return "不存在";
		} else {
			String pass = users.get(0).getUsersPass();
			return pass;
		}
	}

	@RequestMapping(value = "/addpoint/{location}", method = RequestMethod.GET)
	public String addpoint(@PathVariable("location") String location) {
		String[] info = location.split("&");
		String name = info[0];
		String local = info[1];
		System.out.println(location);
		List<User> users = userService.getUserByName(name);
		User user = users.get(0);
		try {
			user.setUsersPoints(user.getUsersPoints() + ";" + local);
			userService.save(user);
			System.out.println(user.getUsersPoints());
			return "SUCCESS";
		} catch (Exception e) {
			e.printStackTrace();
			return "FAIL";
		}
	}

	@RequestMapping(value = "/showpoint/{name}", method = RequestMethod.GET)
	public String[] showpoint(@PathVariable("name") String name) {
		List<User> users = userService.getUserByName(name);
		User user = users.get(0);
		String[] points = user.getUsersPoints().split(";");
		return points;

	}

}
