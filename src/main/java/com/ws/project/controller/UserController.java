package com.ws.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.project.domain.User;
import com.ws.project.service.UserService;

/**
 * @author alain busokoza
 *
 */
@RestController
public class UserController {
	
	@Autowired()
	UserService userService;

	@RequestMapping(value="/")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping(value="/all")
	public List<User> getUserList() {
		return userService.generateUserList();
	}
}
