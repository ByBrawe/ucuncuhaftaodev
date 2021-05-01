package odev3hafta;

public class UserManager {
	
	
	public void add(User user) {
		System.out.println(user.getFullname() + "ki�i eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFullname() + " ki�i silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFullname() + " ki�i g�ncellendi");
	}

	
	public void addToUsers(User[] user) {
		
		System.out.println("Toplu Ekleme");
		
		for (User userlist : user) {
			
			add(userlist);			
		}
		
	}
	
}
