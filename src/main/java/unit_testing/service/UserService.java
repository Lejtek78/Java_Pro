package unit_testing.service;

import unit_testing.model.User;

public interface UserService {

	public User createUser(String firstName,
						   String lastName,
						   String email,
						   String password,
						   String repeatPassword);
	
}
