import java.util.ArrayList;
import java.util.Scanner;

public class Athleti extends Person {

	public static int count = 1;
	private int id;
	private String title;
	private double reward = 0;
	private String sport;

	static ArrayList<Athleti> arrAthleti = new ArrayList<Athleti>();

	Scanner in = new Scanner(System.in);

	public Athleti() {
		super();
		this.position = "Athleti";
		this.id = count++;
		this.reward = 0;
	}

	public Athleti(String name, String gender, String date, String sport) {
		super(name, gender, date);
		this.position = "Athleti";
		this.sport = sport;
		this.id = count++;
		this.title = null;
		this.reward = 0;
	}

	public double getReward() {
		return reward;
	}

	public void setReward(double reward) {
		this.reward = this.reward + reward;
	}

	public int getId() {
		return id;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return position + ": \nId: " + id + "\nName : " + name + "\ngender: " + gender + "\nbirthday: " + date+"\nSport: "+sport;
	}

	public static void frameAthleti() {

		Scanner input = new Scanner(System.in);

		System.out.println("*****************************WELCOME ATHLETES*****************************");
		System.out.println();

		System.out.println("*-------------------------------*");
		System.out.println("*                               *");
		System.out.println("* 1.Show Athletes Information   *");
		System.out.println("* 2.Show Salary                 *");
		System.out.println("* 3.Show Calendar               *");
		System.out.println("* 4.Change password             *");
		System.out.println("* 5.Logout                      *");
		System.out.println("* 6.Exit                        *");
		System.out.println("*-------------------------------*");
		int i;
		do {
			System.out.print("\nYour choose => Enter:  ");
			i = input.nextInt();
		} while (i < 1 || i > 6);

		switch (i) {
		case 1: {
			String name = User.tempName;
			for (int j = 0; j < Athleti.arrAthleti.size(); j++) {
				if (name.equals(Athleti.arrAthleti.get(j).getName()))
					;
				{
					System.out.println(Athleti.arrAthleti.get(j).toString());
					break;
				}
			}

			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s;
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Athleti.frameAthleti();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
			}

			break;
		}
		case 2: {
			salary();
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s;
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Athleti.frameAthleti();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
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
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Athleti.frameAthleti();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
			}
		}
			break;
		case 4: {
			Account.changePwd();
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s;
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				Athleti.frameAthleti();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
			}
		}
			break;

		case 5:
			User.Giaodien();
			break;

		case 6:
			System.out.println(" Program finished! 'Ctrl+F11' to run again");
			break;
		}
	}

	public static void salary() {

		String name = User.tempName;
		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			if (name.equals(Athleti.arrAthleti.get(i).getName())) {
				for (int j = 0; j < Sport.arrSport.size(); j++) {
					if (Athleti.arrAthleti.get(i).getSport().equals(Sport.arrSport.get(j).getName())) {

						System.out.println("Basic Salary: " + Sport.arrSport.get(j).getBasicSalary());
						System.out.println("Reward: " + Athleti.arrAthleti.get(i).getReward());
						System.out.println("Total: "
								+ (Athleti.arrAthleti.get(i).getReward() + Sport.arrSport.get(j).getBasicSalary()));
					}

				}
			}
		}
	}

	public static void showCalendar() {
		
		String name = User.tempName;
		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			if (name.equals(Athleti.arrAthleti.get(i).getName())) {
				for (int j = 0; j < Calendar.arrMatch.size(); j++) {
					if (Athleti.arrAthleti.get(i).getSport().equals(Calendar.arrMatch.get(j).getNameSport())) {
						System.out.println("Match Calendar: " + Calendar.arrMatch.get(j).toString());
						break;
					}
				}
				for (int j = 0; j < Calendar.arrPractice.size(); j++) {
					if (Athleti.arrAthleti.get(i).getSport().equals(Calendar.arrPractice.get(j).getNameSport())) {
						System.out.println("Practice Calendar: " + Calendar.arrPractice.get(j).toString());
						break;
					}
				}
				
				break;
			}
		}
		
	}

}
