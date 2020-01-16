import java.util.Scanner;

public class User {

	public static String tempName;
	public static int count = 1;

	public static void Giaodien() {
		Scanner input = new Scanner(System.in);
		System.out.println("  ***************************************************************************************");
		System.out.println("  ***************************************************************************************");
		System.out.println("  **********************************      WELCOME     ***********************************");
		System.out.println("  ***************************************************************************************");
		System.out.println("  ***************************************************************************************");

		System.out.println("\n\n");

		System.out.println("\t\t****************************************");
		System.out.println("\t\t*          WELCOME TO APPLICATION      *");
		System.out.println("\t\t*    1.Login                           *");
		System.out.println("\t\t*    2.Exit                            *");

		System.out.println("\t\t****************************************");
		int temp;
		do {
			System.out.print("Please choose: => Enter: ");
			temp = input.nextInt();
		} while (temp < 1 || temp > 2);
		switch (temp) {
		case 1:
			login();
			break;
		case 2:
			break;
		}
	}

	public static void login() {

		System.out.println("****************************************");
		System.out.println("*                LOGIN                 *");
		System.out.println("****************************************");
		System.out.println("\n");

		Scanner input = new Scanner(System.in);
		String name;
		String pw;
		int check = 0;
		int n;
		final int MANAGER = 171120;
		final int COACH = 309200;
		int coach;
		int manager;

		System.out.print("   Name: ");
		name = input.nextLine();
		System.out.print("\n   Password: ");
		pw = input.nextLine();

		System.out.println("You are :   1. Manager");
		System.out.println("            2. Coach");
		System.out.println("            3. Athleti");

		do {
			System.out.print("\nYour choose => Enter:  ");
			n = input.nextInt();
		} while (n < 1 || n > 3);

		if (n == 2) {
			do {

				System.out.println("Enter code Coach: ");
				count++;
				coach = input.nextInt();
				if (count == 5) {
					System.out.println("Incorrect over 5 times, please login again ");
					login();
				}
			} while (coach != COACH);
		}

		if (n == 1) {

			do {

				System.out.println("Enter code Manager: ");
				manager = input.nextInt();
				count++;

				if (count == 5) {
					System.out.println("\"Incorrect over 5 times, please login again ");
					login();
				}

			} while (manager != MANAGER);
		}

		// System.out.println(list.get(0).getPassword());

		// System.out.println("name: "+name+ " password: "+pw);

		// System.out.println(Manager.arrManager.get(0).getName());

		switch (n) {
		case 1:
			for (int i = 0; i < Manager.arrManager.size(); i++) {
				if (name.equals(Manager.arrManager.get(i).getName())) {
					for (int j = 0; j < Account.list.size(); j++) {
						if (name.equals(Account.list.get(j).getName())) {
							if (pw.equals(Account.list.get(j).getPassword())) {
								System.out.println("Login successful");
								User.tempName = name;
								ManagerManageInfo.frameManager();
								break;
							} else {
								System.out.println("name or password is incorrect, please login again\n");
								System.out.println("Ban muon 1.tiep tuc");
								System.out.println("         2.Logout");
								System.out.println("         3.Exit");
								int d;
								do {
									System.out.print("\nYour choose => Enter:  ");
									d = input.nextInt();
								} while (d < 1 || d > 3);

								switch (d) {
									case 1:
										login();
										break;
									case 2:
										User.Giaodien();
										break;
									case 3:
										break;
								}
							}
						}
					}
					check = 1;
				}
			}

			if (check != 1) {
				System.out.println("name or password is incorrect, please login again\n");
				System.out.println("Choose:  1.Continue");
				System.out.println("         2.Logout");
				System.out.println("         3.Exit");
				int d;
				do {
					System.out.print("\nYour choose => Enter:  ");
					d = input.nextInt();
				} while (d < 1 || d > 3);

				switch (d) {
					case 1:
						login();
						break;
					case 2:
						User.Giaodien();
						break;
					case 3:
						break;
				}
			}
			break;
		case 2:

			for (int j = 0; j < Coach.arrCoach.size(); j++) {
				if (name.equals(Coach.arrCoach.get(j).getName())) {
					for (int i = 0; i < Account.list.size(); i++) {
						if (name.equals(Account.list.get(i).getName())) {
							if (pw.equals(Account.list.get(i).getPassword())) {
								User.tempName = name;
								System.out.println("Login successful");
								Coach.frameCoach();
								break;
							} else {
								System.out.println("name or password is incorrect, please login again\n");
								System.out.println("Choose:  1.Continue");
								System.out.println("         2.Logout");
								System.out.println("         3.Exit");
								int d;
								do {
									System.out.print("\nYour choose => Enter:  ");
									d = input.nextInt();
								} while (d < 1 || d > 3);

								switch (d) {
									case 1:
										login();
										break;
									case 2:
										User.Giaodien();
										break;
									case 3:
										break;
								}
							}
						}
					}
					check = 1;
				}
			}
			if (check != 1) {
				System.out.println("name or password is incorrect, please login again\n");
				System.out.println("Choose:  1.Continue");
				System.out.println("         2.Logout");
				System.out.println("         3.Exit");
				int d;
				do {
					System.out.print("\nYour choose => Enter:  ");
					d = input.nextInt();
				} while (d < 1 || d > 3);
				switch (d) {
					case 1:
						login();
						break;
					case 2:
						User.Giaodien();
						break;
					case 3:
						break;
				}
			}
			break;

		case 3:
			for (int j = 0; j < Athleti.arrAthleti.size(); j++) {
				if (name.equals(Athleti.arrAthleti.get(j).getName())) {
					for (int i = 0; i < Account.list.size(); i++) {
						if (name.equals(Account.list.get(i).getName())) {
							if (pw.equals(Account.list.get(i).getPassword())) {
								User.tempName = name;
								System.out.println("Login successful");
								Athleti.frameAthleti();
								break;
							} else {
								System.out.println("name or password is incorrect, please login again\n");
								System.out.println("Choose:  1.Continue");
								System.out.println("         2.Logout");
								System.out.println("         3.Exit");
								int d;
								do {
									System.out.print("\nYour choose => Enter:  ");
									d = input.nextInt();
								} while (d < 1 || d > 3);
								switch (d) {
									case 1:
										login();
										break;
									case 2:
										User.Giaodien();
										break;
									case 3:
										break;
								}
							}
						}
					}
					check = 1;
				}
			}
			if (check != 1) {
				System.out.println("name or password is incorrect, please login again\n");
				System.out.println("Choose:  1.Continue");
				System.out.println("         2.Logout");
				System.out.println("         3.Exit");
				int d;
				do {
					System.out.print("\nYour choose => Enter:  ");
					d = input.nextInt();
				} while (d < 1 || d > 3);
				switch (d) {
				case 1:
					login();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					System.exit(0);
					break;
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		Account.list.add(new Account("Manh", "12345"));
		Account.list.add(new Account("manh", "12345"));
		Account.list.add(new Account("manh1", "12345"));
		Account.list.add(new Account("manh2", "12345"));
		Account.list.add(new Account("manh0", "12345"));

		UseSport.arrSport.add(new Sport("bongda", 12000));
		UseSport.arrSport.add(new Sport("caulong", 12000));

		Manager.arrManager.add(new Manager("Manh", "male", " 01-01-1977"));
		Athleti.arrAthleti.add(new Athleti("manh", "male", "01-10-2000", "bongda"));
		Athleti.arrAthleti.add(new Athleti("manh0", "male", "01-10-2000", "bongda"));
		Athleti.arrAthleti.add(new Athleti("loan", "male", "01-10-2000", "caulong"));

		Coach.arrCoach.add(new Coach("manh1", "male", "11-12-2000","bongda"));
		Coach.arrCoach.add(new Coach("manh2", "male", "11-12-2000","caulong"));
		User.Giaodien();
	}
}
