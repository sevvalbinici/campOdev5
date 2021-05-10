package campOdev5.business.concretes;

import java.util.List;

import campOdev5.business.abstracts.UserService ;
import campOdev5.core.concretes.LoginWithGoogleManager;
import campOdev5.dataAccess.abstracts.UserDao;
import campOdev5.entities.concretes.User;


public class UserManager implements UserService {
	 private UserDao userDao;
	private LoginWithGoogleManager loginWithGoogleManager;
     
	public UserManager(UserDao userDao ) {
		super();
		this.userDao = userDao;
	
	}
	
	public UserManager(LoginWithGoogleManager loginWithGoogleManager ) {
		super();
		this.loginWithGoogleManager = loginWithGoogleManager;
	
	}


	@Override
	public void add(User user) {
		
		if (user.getFirstName().length() >=2  && user.getLastName().length() >= 2) {
			System.out.println(user.getFirstName() +" " + "baþarýlý isim" +" " + user.getLastName() +" " + "baþarýlý soyisim");
			}
		else {
			System.out.println("lütfen geçerli isim ve soy isim giriniz");
		}
		
		if ( user.getPassword().length() < 6) {
			System.out.println("lütfen en az 6 karakterli þifre giriniz");
		}
		else {
			System.out.println("güvenilir þifre");
		}
			
	    
	
	this.userDao.add(user);
	

	}



	@Override
	public void login(String eposta, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void loginWithGoogle(String email, String pasword) {
		// TODO Auto-generated method stub
		
	}

		
	}


	



		
	


