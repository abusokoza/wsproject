package com.ws.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ws.project.domain.User;


/**
 * @author alain busokoza
 *
 */
@Repository
public interface UserDao {

	/**
	 * Retrieves a user's info based on their ssn
	 * @param ssn
	 * @return
	 * @throws Exception
	 */
	public User getUser(int ssn) throws Exception;

	/**
	 * Retrieves all users' info
	 * @return
	 * @throws Exception
	 */
	public List<User> getUserList() throws Exception;

	/**
	 * Creates/adds a new user 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int createUser(User user) throws Exception;

	/**
	 * 
	 * Updates a user's info 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int updateUser(User user) throws Exception;

	/**
	 * Deletes a user's info based on their ssn
	 * @param ssn
	 * @throws Exception
	 */
	public void deleteUser(int ssn) throws Exception;
}
