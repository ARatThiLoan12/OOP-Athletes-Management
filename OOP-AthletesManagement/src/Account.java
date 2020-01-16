import java.util.ArrayList;
import java.util.Scanner;

public class Account {

	
	private String name;
	private String Password;
	
	static ArrayList<Account> list = new ArrayList<Account>();

	public Account() {
		
	}
	
	public Account(String name, String password) {
		this.name = name;
		this.Password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", Password=" + Password + "]";
	}

	public static void changePwd() {
		Scanner input = new Scanner(System.in);
		String tempName = User.tempName;
		 String tempPw = null; 
		String temppassword;
		String tempPasswordNew1;
		String tempPasswordNew2;
		
		
        for (int i = 0; i < list.size(); i++) {
			if (tempName.equals(list.get(i).getName())) {
				tempPw = list.get(i).getPassword();
				break;
			}
		}
		System.out.println("================= CHANGE PASSWORD =================");
		System.out.print("\n");
	
		do {
		System.out.print("Enter Old Password: ");
		temppassword = input.next();
		}
		while(!(temppassword.equals(tempPw)));
		
		System.out.print("Enter New Password: ");
		tempPasswordNew1 = input.next();
		do {
		System.out.print("Confirm New Password: ");
		tempPasswordNew2 = input.next();
		}
		while(!(tempPasswordNew1.equals(tempPasswordNew2)));

		 for (int i = 0; i < list.size(); i++) {
				if (tempName.equals(list.get(i).getName())) {
					list.get(i).setPassword(tempPasswordNew2);
					System.out.println("Changed Password Successfully!");
					break;
				}
		 }
	}

	public static void addAccount() {
		Scanner input = new Scanner(System.in);
		String tempName;
		String tempPw;
		System.out.print("   Name: ");
		tempName = input.nextLine();
		System.out.print("\n   Password: ");
		tempPw = input.nextLine();
		Account account = new Account(tempName, tempPw);
		list.add(account);	
	}
	
	public static void addAccount(String name, String password) {
		Account account = new Account(name, password);
		list.add(account);
	}

	public static void showAccount() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	
}
