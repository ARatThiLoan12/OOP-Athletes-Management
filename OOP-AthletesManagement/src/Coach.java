import java.util.ArrayList;
import java.util.Scanner;

public class Coach extends Person {
	public static int count = 1;
	private int id;
	private String sport;

	static ArrayList<Coach> arrCoach = new ArrayList<Coach>();
	Scanner in = new Scanner(System.in);

	public Coach() {
		super();
		this.position = "Coach";
	}

	public Coach(String name, String gender, String date, String sport) {
		super(name, gender, date);
		this.position = "Coach";
		this.sport = sport;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setGender(String gender) {

		this.gender = gender;
	}

	public String toString() {
		return position + ": \nid: " + id + "\nName : " + name + ",\ngender :" + gender + ",\nbirthday : " + date+ "\nSport: "+sport;
	}

	public static void frameCoach() {
		Scanner input = new Scanner(System.in);

		System.out.println("*****************************COACH PAGE*****************************");
		System.out.println("\n");

		System.out.println("*---------------------------*");
		System.out.println("*                           *");
		System.out.println("* 1.Personal Information    *");
		System.out.println("* 2.List Athletes           *");
		System.out.println("* 3.Calendar                *");
		System.out.println("* 4.Logout                  *");
		System.out.println("* 5.Exit                    *");

		System.out.println("*---------------------------*");
		int i;
		do {
			System.out.print("Your choose => Enter:  ");
			i = input.nextInt();
		} while (i < 1 || i > 5);

		switch (i) {
		case 1: {
			String name = User.tempName;
			for (int j = 0; j < Coach.arrCoach.size(); j++) {
				if (name.equals(Coach.arrCoach.get(j).getName()))
					;
				System.out.println(Coach.arrCoach.get(j).toString());
				break;
			}

			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s;
			do {
				System.out.print("Your choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Coach.frameCoach();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				break;
			}
		}

			break;
		case 2: {
			listAthletes();
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s;
			do {
				System.out.print("Your choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Coach.frameCoach();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				break;
			}
		}
			break;

		case 3: {
			showCalendar();
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s;
			do {
				System.out.print("Your choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Coach.frameCoach();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				break;
			}
		}

			break;
		case 4:
			User.Giaodien();
			break;
		case 5:
			break;

		}

	}

	public static void listAthletes() {
		Scanner input = new Scanner(System.in);
		int check = 0;
		String name = User.tempName;
		for (int i = 0; i < Coach.arrCoach.size(); i++) {
			if (name.equals(Coach.arrCoach.get(i).getName())) {
				for (int j = 0; j < Athleti.arrAthleti.size(); j++) {
					if (Coach.arrCoach.get(i).getSport().equals(Athleti.arrAthleti.get(j).getSport())) {
						System.out.println(Athleti.arrAthleti.get(j).getName());
						check = 1;
					}
				}
			}
		}

		if (check != 1) {
			System.out.println("Coach " + name + "does not train any athlete!\n");

			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s;
			do {
				System.out.print("Your choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Coach.frameCoach();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				break;
			}
		}
	}

	public static void showCalendar() {

		String name = User.tempName;
		for (int i = 0; i < Coach.arrCoach.size(); i++) {
			if (name.equals(Coach.arrCoach.get(i).getName())) {
				for (int j = 0; j < Calendar.arrMatch.size(); j++) {
					if (Coach.arrCoach.get(i).getSport().equals(Calendar.arrMatch.get(j).getNameSport())) {
						System.out.println("Match Calendar: " + Calendar.arrMatch.get(j).toString());
						break;
					}
				}
				for (int j = 0; j < Calendar.arrPractice.size(); j++) {
					if (Coach.arrCoach.get(i).getSport().equals(Calendar.arrPractice.get(j).getNameSport())) {
						System.out.println("Practice Calendar: " + Calendar.arrPractice.get(j).toString());
						break;
					}
				}

				break;
			}
		}

	}

}
