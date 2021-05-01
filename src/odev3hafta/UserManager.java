package odev3hafta;

public class UserManager {
	
	
	public void add(User user) {
		System.out.println(user.getFullname() + "kiþi eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFullname() + " kiþi silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFullname() + " kiþi güncellendi");
	}

	
	public void addToUsers(User[] user) {
		
		System.out.println("Toplu Ekleme");
		
		for (User userlist : user) {
			
			add(userlist);			
		}
		
	}
	
}
