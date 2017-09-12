package com.ws.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.project.dao.UserDao;
import com.ws.project.domain.User;
import com.ws.project.service.UserService;

/**
 * @author alain busokoza
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public User getUser(int ssn) throws Exception {
		User user = userDao.getUser(ssn);
		return user;
	}

	@Override
	public List<User> getUserList() throws Exception {
		List<User> userList = userDao.getUserList();
		return userList;
	}

	@Override
	public int createUser(User user) throws Exception {
		int ssn = userDao.createUser(user);
		return ssn;
	}

	@Override
	public int updateUser(User user) throws Exception {
		int ssn = userDao.updateUser(user);
		return ssn;
	}

	@Override
	public void deleteUser(int ssn) throws Exception {
		userDao.deleteUser(ssn);
	}
	
	public List<User> generateUserList(){
		List<User> userList = new ArrayList<User>();
		
		User user1 = new User("John","Doe","Engineer", 25);
		User user2 = new User("Jane","Doe","BA", 32);
		User user3 = new User("Mike","Doe","Tester", 30);
		User user4 = new User("Mika","Doe","Engineer", 42);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		
		return userList;
	}

}
