package list;
import java.util.ArrayList;
import java.util.Scanner;
class Registration
{
	public String name;
	public String address ;
	public int proofid ;
	public int id;
	public static int option;
	public static String choice1,choice2;
	Registration(int id,String name,String address,int proofid)
	{   this.id=id;
		this.name=name;
		this.address=address;
		this.proofid=proofid;	
	}
	int getid()
	{
		return id;
	}
	String getname()
	{
		return name;
	}
	String getaddress()
	{
		return address;
	}
	int getproofid()
	{
		return proofid ;
	}
//}
//class Registration
//{
	public static void main(String args[])
	{   
	    String choice1,choice2;
		int option;
		int id=1000;
		ArrayList<Registration> user1=new ArrayList<Registration>();
		//ArrayList<Registration> user2=new ArrayList<Registration>();
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("1.Registration \n2.Veiw\n3.Exit");
		option=s.nextInt();
		switch(option)
		{
		case 1:
			do
			{
				System.out.println("\t\t\tRegistration....");
				System.out.println("Enter your name:");
				String name=s.next();
				System.out.println("Enter your address:");
				String address=s.next();
				System.out.println("Enter your proof id:");
				int proofid=s.nextInt();
				System.out.println("Thank you for registering.....");
				System.out.println("Your Registration id is:"+id);
				Registration obj=new Registration(id,name,address,proofid);
				user1.add(obj);
				id++;
			    System.out.println("Do you want to continue registration(y/n)");
				choice1=s.next();
			}
		   while(choice1.contentEquals("y"));
			break;
		case 2:
			System.out.println("Customers list.....");
			System.out.println("The registered customers are:");
			for(int i=0;i<user1.size();i++)
			{
				System.out.println("The id is:"+user1.get(i).getid());
				System.out.println("The name is:"+user1.get(i).getname());
				System.out.println("The address is:"+user1.get(i).getaddress());
				System.out.println("The proof id is:"+user1.get(i).getproofid());
			}
			break;
		case 3:
			System.exit(0);
			break;
		default:System.out.println("Invalid");
		}
		System.out.println("Do you want to continue?(y/n)");
		choice2=s.next();
		}
		while(choice2.equals("y"));	
			}
		}
		
		
		
	
	
	
   
	
	
	
	
	
	
	


