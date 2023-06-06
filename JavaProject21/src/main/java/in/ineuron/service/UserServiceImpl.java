package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.models.User;
import in.ineuron.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		//System.out.println("**************************"+user.getName());
		
		return userRepository.save(user);
	}

}
