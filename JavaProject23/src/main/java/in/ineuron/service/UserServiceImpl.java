package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.ineuron.models.User;
import in.ineuron.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@Override
	public User addUser(User user) {

		user.setPassword(passwordEncode.encode(user.getPassword()));
		//user.setPassword(user.getPassword());
		user.setRole("ROLE_USER");

		return userRepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {

		return userRepo.existsByEmail(email);
	}
}
