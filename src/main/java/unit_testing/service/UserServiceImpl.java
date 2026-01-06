package unit_testing.service;

import java.util.UUID;

import unit_testing.model.User;
import unit_testing.model.UsersRepository;
import unit_testing.model.UsersRepositoryImpl;

public class UserServiceImpl implements UserService {

	@Override
	public User createUser(String firstName, String lastName, String email, String password, String repeatPassword) {
		if (firstName == null || firstName.trim().length() == 0) {
			throw new IllegalArgumentException("User's first name is empty");
		}
		
		if (lastName == null || lastName.trim().length() == 0) {
			throw new IllegalArgumentException("User's last name is empty");
		}
		
		User user = new User(firstName, lastName, email, UUID.randomUUID().toString());
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.save(user);
		
		return user;
	}

}
