package in.ineuron.service;

import in.ineuron.models.User;

public interface IUserService {
	User addUser(User user);
	public boolean checkEmail(String email);
	
	
}
