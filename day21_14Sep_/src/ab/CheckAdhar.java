package ab;

import java.util.Random;

public class CheckAdhar extends Exception {
	CheckAdhar(){}
	CheckAdhar(String s)
	{
		super(s);
	}
	UserDTO userDTO=new UserDTO();
	public UserDTO generateAdhar(User u) throws CheckAdhar
	{
		if(u.getName().length()>1)
		{
			String nn = u.getName();
userDTO.setName("Mr "+nn.substring(0,1).toUpperCase()+nn.substring(1).toLowerCase());
		
		}
		else
		{
			userDTO.setName("Invalid Name");
		}
		userDTO.setAdd(u.getAdd().toLowerCase());
		
		if(u.getAge()>=18 && u.getAge()<=60)
		{
			 userDTO.setAdhar(createID());
			 userDTO.setAge(u.getAge());
		}
		else
		{
			throw new CheckAdhar("Age invalid PLZ Contact Admin");
		}
		return userDTO;
	}
	
	private String createID()
	{
		 StringBuffer sb = new StringBuffer();
		for(int i=0; i<=10;i++)
		{
			sb.append(new Random().nextInt(10));
		}
		return sb.toString().substring(0, 5)+"XXXX"+sb.substring(5);
	}
	
}
