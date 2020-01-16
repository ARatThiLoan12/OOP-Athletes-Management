import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Person{
	public static int count = 1;
	private int id;
	

	
	public static ArrayList<Manager> arrManager = new ArrayList<Manager>();
	
	
	public Manager() {
		super();
		this.position ="Manager";
	}
	public Manager(String name, String gender, String date) {
		super(name, gender, date);
		this.position ="Manager";
	}
	
	Scanner in = new Scanner(System.in);
	
	public void setGender(String gender) {
		this.gender = gender;	
	}
	
    public int getId() {
		return id;
	}
    
	public void setName(String name) {
		this.name = name;	
	}

	public void setDate(String date) {
		this.date = date;
	}



	
	
	public String toString() {
		return this.position + "\nId: "+id+"\nName : " + name + "\ngender: " + gender + "\nbirthday: " + date;
	}
	
}


