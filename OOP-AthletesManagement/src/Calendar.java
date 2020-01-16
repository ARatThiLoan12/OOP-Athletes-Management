
import java.util.ArrayList;
import java.util.Scanner;

public class Calendar {
	private int time;
	private String date;
	private String place;
	private String nameSport;

	public Calendar() {

	}

	public String getNameSport() {
		return nameSport;
	}
	public Calendar(int time, String date, String place, String nameSport) {
		this.time = time;
		this.date = date;
		this.place = place;
		this.nameSport = nameSport;
	}
	
	public String toString() {
		return "Sport : " + nameSport + "\n  Calendar : " + "\n -Date time" + date + "-" + time + "\n -Place "
				+ place+"\n";
	}

	static ArrayList<Calendar> arrMatch = new ArrayList<Calendar>();
	static ArrayList<Calendar> arrPractice = new ArrayList<Calendar>();
	
//========================================= Practice Calendar
	
	public static void PracticeCalendar() {
		int time;
		String date;
		String place;
		String nameSport;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter sport :");
		nameSport = in.next();

		for (int i = 0; i < UseSport.arrSport.size(); i++) {
			if (nameSport.equals(UseSport.arrSport.get(i).getName())) {

				System.out.println("*** Add the practice calendar ***");

				do {
					System.out.println("Time : ");
					time = in.nextInt();
				} while (time > 24 || time < 1);

				System.out.println("Date : ");
				date = in.next();

				System.out.println("Place:");
				place = in.next();

				Calendar cal = new Calendar(time, date, place, nameSport);
				arrPractice.add(cal);
				System.out.println("Added calendar successful!");
			}
			break;

		}
	}
	//=============================================  Match Calendar
	public static void MatchCalendar() {
		int time;
		String date;
		String place;
		String nameSport;
       System.out.println("Add the practice calendar");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter sport :");
		nameSport = in.next();
		
		do {
			System.out.println("Time : ");
			time = in.nextInt();
		} while (time > 24 || time < 1);

		System.out.println("Date : ");
		date = in.next();

		System.out.println("Place:");
		place = in.next();
		

		for (int i = 0; i < UseSport.arrSport.size(); i++) {
			if (nameSport.equals(UseSport.arrSport.get(i).getName())) {
				Calendar cal = new Calendar(time, date, place, nameSport);
				arrMatch.add(cal);
				System.out.println("Added calendar successful!");
			break;
			}
		}
	}
	

	
	public static void showPractice() {
		System.out.println("======Practice Calendar======");
		for (int i = 0; i < arrPractice.size(); i++) {
			System.out.println(arrPractice.get(i).toString());
		}
	}
	
	public static void showMatch() {
		System.out.println("======Match Calendar======");
		for (int i = 0; i < arrMatch.size(); i++) {
			System.out.println(arrMatch.get(i).toString());
		}
	}
	
	
}
