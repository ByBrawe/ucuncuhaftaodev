package odev3hafta;

public class Main {

	public static void main(String[] args) {

	
	Student student1 = new Student();
	student1.setId(1);
	student1.setFirstName("Ömer");
	student1.setLastName("tektas");
	student1.setEmail("bbb@go.com");
	student1.setPassword("123456");
	
	Student student2 = new Student();
	student2.setId(2);
	student2.setFirstName("ali");
	student2.setLastName("tektas");
	student2.setEmail("bbb@go.com");
	student2.setPassword("123456");
	
	User[] userlist = {student1,student2};
	
	
	
	
	
	
	
	Instructor instructor1 = new Instructor();
	instructor1.setId(1);
	instructor1.setFirstName("hasan");
	instructor1.setLastName("tektas");
	instructor1.setEmail("bb2b@go.com");
	instructor1.setPassword("1223456");
			
	UserManager userManager = new UserManager();
	StudentManager studentManager = new StudentManager();
	InstructorManager instructorManager = new InstructorManager();
	
	
	
	userManager.add(student1);
	studentManager.update(student2);
	instructorManager.delete(instructor1);

	userManager.addToUsers(userlist);
	
		
		
	}

}
