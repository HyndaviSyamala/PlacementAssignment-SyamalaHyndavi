package in.ineuron.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import in.ineuron.models.User;
import in.ineuron.repository.UserRepository;
import in.ineuron.service.IUserService;

public class UserDetailsServiceImpl implements UserDetailsService
{

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		User user = userRepo.findByEmail(email);
		System.out.println(user);
		System.out.println(email);

		if (user != null) {
			return new CustomUserDetails(user);
		}

		throw new UsernameNotFoundException("user not available");
	}

}
