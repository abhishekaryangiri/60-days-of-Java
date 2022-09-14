package ab;

import java.util.Scanner;

public class DADA {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Name");
	String n = s.nextLine();
	System.out.println("Enter Add");
	String ad = s.nextLine();
	System.out.println("Age");
	int ag =Integer.parseInt(s.nextLine());
	User u = new User();
	
	u.setName(n);
	u.setAdd(ad);
	u.setAge(ag);
	
	CheckAdhar checkAdhar=new CheckAdhar();
	try {
		UserDTO d = checkAdhar.generateAdhar(u);
		System.out.println(d.getAdhar()+" "+d.getName()+" "+d.getAge()+" "+d.getAdd());
		
		
	} catch (CheckAdhar e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
