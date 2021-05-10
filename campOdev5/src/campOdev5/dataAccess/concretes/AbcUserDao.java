package campOdev5.dataAccess.concretes;

import campOdev5.dataAccess.abstracts.UserDao;
import campOdev5.entities.concretes.User;

public class AbcUserDao implements UserDao{

	@Override
	public void add(User user) {
  System.out.println(user.getFirstName()+ " " + user.getLastName() + " " + "Abc ile eklendi");		
	}

	
	

	@Override
	public void add(User[] user) {
		// TODO Auto-generated method stub
		
	}

	

	
}
