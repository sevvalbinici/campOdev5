package campOdev5;
import java.util.Scanner;

import campOdev5.business.concretes.UserManager;
import campOdev5.core.concretes.LoginWithGoogleManager;
import campOdev5.dataAccess.concretes.AbcUserDao;
import campOdev5.entities.concretes.User;


public class Main { 

	public static void main(String[] args) {
		 User user1 = new User(1, "Þevval", "Binici", "svl@svl.com", "123456");
		 UserManager manager = new UserManager(new AbcUserDao());
		 UserManager manager2 = new UserManager(new LoginWithGoogleManager());
		
		
		Scanner scanner = new Scanner(System.in);
		
		String selamlama = "Hoþgeldiniz"+
						  "*******************";
		String islemler = "1) Kayýt olmak için 1'e basýnýz.\n"+
						  "2) Google ile giriþ yapmak için 2'ye basýnýz.\n"+
						  "3) Giriþ yapmak için 3'e basýnýz\n"+
						  "Çýkýþ yapmak için lütfen q'ya basýnýz";
		String key;
		
		while(true) { 
			System.out.println(islemler);
			System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz");
			key = scanner.nextLine();
			switch (key) {
			case "1":
				manager.register(user1);
				
				break;
			case "2":
				System.out.println("Email adresinizi giriniz :");
				String mail= scanner.nextLine();
				System.out.println("Lütfen þifrenizi giriniz : ");
				String pasword = scanner.nextLine();
				manager2.loginWithGoogle(mail,pasword);
				break;
			case "3":
				System.out.println("Email adresinizi giriniz :");
				String mail1= scanner.nextLine();
				System.out.println("Lütfen þifrenizi giriniz : ");
				String pasword1 = scanner.nextLine();
				manager.login(mail1, pasword1);
				break;
			case "q" : 
				System.out.println("Bizi seçtiðiniz için teþekkür ederiz. Çýkýþ yapýlýyor.");
				return;
			default:
				
			}
		
		}

	}
}