package campOdev5;
import java.util.Scanner;

import campOdev5.business.concretes.UserManager;
import campOdev5.core.concretes.LoginWithGoogleManager;
import campOdev5.dataAccess.concretes.AbcUserDao;
import campOdev5.entities.concretes.User;


public class Main { 

	public static void main(String[] args) {
		 User user1 = new User(1, "�evval", "Binici", "svl@svl.com", "123456");
		 UserManager manager = new UserManager(new AbcUserDao());
		 UserManager manager2 = new UserManager(new LoginWithGoogleManager());
		
		
		Scanner scanner = new Scanner(System.in);
		
		String selamlama = "Ho�geldiniz"+
						  "*******************";
		String islemler = "1) Kay�t olmak i�in 1'e bas�n�z.\n"+
						  "2) Google ile giri� yapmak i�in 2'ye bas�n�z.\n"+
						  "3) Giri� yapmak i�in 3'e bas�n�z\n"+
						  "��k�� yapmak i�in l�tfen q'ya bas�n�z";
		String key;
		
		while(true) { 
			System.out.println(islemler);
			System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz");
			key = scanner.nextLine();
			switch (key) {
			case "1":
				manager.register(user1);
				
				break;
			case "2":
				System.out.println("Email adresinizi giriniz :");
				String mail= scanner.nextLine();
				System.out.println("L�tfen �ifrenizi giriniz : ");
				String pasword = scanner.nextLine();
				manager2.loginWithGoogle(mail,pasword);
				break;
			case "3":
				System.out.println("Email adresinizi giriniz :");
				String mail1= scanner.nextLine();
				System.out.println("L�tfen �ifrenizi giriniz : ");
				String pasword1 = scanner.nextLine();
				manager.login(mail1, pasword1);
				break;
			case "q" : 
				System.out.println("Bizi se�ti�iniz i�in te�ekk�r ederiz. ��k�� yap�l�yor.");
				return;
			default:
				
			}
		
		}

	}
}