package campOdev5.business.abstracts;

import java.util.List;

import campOdev5.entities.concretes.User;



public interface UserService {
	void register(User user);
	void login(String email, String pasword);
	void loginWithGoogle(String email,String pasword);
	List<User> getAll();
	void add(User user);
        	 
         
}
