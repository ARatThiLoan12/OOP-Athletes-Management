import java.util.Scanner;

public class ManagerManageInfo {

	public static void frameManager() {
		int i;
		Scanner input = new Scanner(System.in);

		System.out.println("*****************************MANAGER PAGE*****************************");
		System.out.println();

		System.out.println("*-----------------------------------*");
		System.out.println("*                                   *");
		System.out.println("* 1.Show Personal Information       *");
		System.out.println("* 2.Manage Information of Athletes  *");
		System.out.println("* 3.Manage Information of Coach     *");
		System.out.println("* 4.Manage Salary                   *");
		System.out.println("* 5.Manage Account                  *");
		System.out.println("* 6.Manage Calendar                 *");
		System.out.println("* 7.Manage Sport                    *");
		System.out.println("* 8.Add Medal                       *");
		System.out.println("* 9.Logout                          *");
		System.out.println("* 10.Exit                           *");
		System.out.println("*-----------------------------------*");
		
		do {
			System.out.print("\nYour choose => Enter:  ");
			i = input.nextInt();
		} while (i < 1 || i > 10);

		switch (i) {
		case 1: {
			String name = User.tempName;
			for (int j = 0; j < Manager.arrManager.size(); j++) {
				if (name.equals(Manager.arrManager.get(j).getName()))
				System.out.println(Manager.arrManager.get(j).toString());
			}

			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s = input.nextInt();
			switch (s) {
			case 1:
				ManagerManageInfo.frameManager();
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
		case 2:
			manageInformationOfAthletis();
			break;
		case 3:
			manageInfomationOfCoach();
			break;
		case 4:
			manageSalary();
			break;
		case 5:
			manageAccount();
			break;
		case 6:
			Calendar();
			break;
		case 7:
			managerSport();
			break;
		case 8:
			addMedal();
			break;
		case 9:
			User.Giaodien();
			break;
		case 10:
			System.out.println(" Program finished! 'Ctrl+F11' to run again");
			break;
		}
	}

	public static void manageInformationOfAthletis() {
		Scanner input = new Scanner(System.in);

		System.out.println("****************************************");
		System.out.println("*         ATHLETES INFORMATION         *");
		System.out.println("****************************************");
		System.out.println("\n\n");

		System.out.println("****************************************");
		System.out.println("*   1.Search Athletes                  *");
		System.out.println("*   2.Show List of Athletes            *");
		System.out.println("*   3.Add New Athletes                 *");
		System.out.println("*   4.Delete Athletes                  *");
		System.out.println("*   5.Edit Information of Athletes     *");
		System.out.println("*   6.Undo                             *");
		System.out.println("*   7.Logout                           *");
		System.out.println("*   8.Exit                             *");
		System.out.println("****************************************");
		System.out.println("\n");
		int tam;
		do {
			System.out.print("\nYour choose => Enter:  ");
			tam = input.nextInt();
		} while (tam < 1 || tam > 7);
		switch (tam) {
		case 1:
			timKiemVDV();
			break;
		case 2:
			showVDV();
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");

			int d = input.nextInt();

			switch (d) {

			case 1:
				ManagerManageInfo.manageInformationOfAthletis();
				break;
			case 2: User.Giaodien();
				break;
			case 3:
				break;
			}
			break;
		case 3:
			addAthletes();
			break;
		case 4:
			deleteAthleti();
			break;
		case 5:
			editThongTinVDV();
			break;
		case 6:
			ManagerManageInfo.frameManager();
			break;
		case 7: 
			User.Giaodien();
			break;
		case 8:
			break;
		}

	}

	public static void managerSport() {
		Scanner input = new Scanner(System.in);

		System.out.println("****************************************");
		System.out.println("*           SPORT INFORMATION          *");
		System.out.println("****************************************");
		System.out.println("\n\n");

		System.out.println("****************************************");
		System.out.println("*   1.Search Sport                     *");
		System.out.println("*   2.Show List of Sport               *");
		System.out.println("*   3.Undo                             *");
		System.out.println("*   4.Logout                           *");
		System.out.println("*   5.Exit                             *");
		System.out.println("****************************************");
		System.out.println("\n");
		int n;
		do {
			System.out.print("\nYour choose => Enter:  ");
			n = input.nextInt();
		} while (n < 1 || n > 5);
		switch (n) {
		case 1:
			UseSport.timKiem();
			break;
		case 2:
			UseSport.showListSport();
			ManagerManageInfo.themsuaxoaSport();
			break;
		case 3:
			ManagerManageInfo.frameManager();
			break;
		case 4:
			User.Giaodien();
			break;
		case 5:
			break;
		}
	}

	public static void manageInfomationOfCoach() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("****************************************");
		System.out.println("*          COACH INFORMATION           *");
		System.out.println("****************************************");
		System.out.println("\n\n");

		System.out.println("****************************************");
		System.out.println("*   1.Search Coach                     *");
		System.out.println("*   2.Show List of Coach               *");
		System.out.println("*   3.Add New Coach                    *");
		System.out.println("*   4.Delete Coach                     *");
		System.out.println("*   5.Edit Information of Coach        *");
		System.out.println("*   6.Undo                             *");
		System.out.println("*   7.Exit                             *");
		System.out.println("*   8.Logout                           *");
		System.out.println("****************************************");
		System.out.println("\n");
		int tam;
		do {
			System.out.print("\nYour choose => Enter:  ");
			tam = input.nextInt();
		} while (tam < 1 || tam > 8);

		switch (tam) {
		case 1:
			timKiemCoach();
			break;
		case 2:
			showCoach();
			break;
		case 3:
			addCoach();
			break;
		case 4:
			deleteCoach();
			break;
		case 5:
			editThongTinCoach();
			break;
		case 6:
			ManagerManageInfo.frameManager();
			break;
		case 7:
			break;
		case 8:
			User.Giaodien();
			break;
		}

	}

	public static void manageAccount() {
		int tam;
		Scanner input = new Scanner(System.in);

		System.out.println("****************************************");
		System.out.println("*            MANAGE ACCOUNT            *");
		System.out.println("****************************************");
		System.out.println("\n\n");
		
		System.out.println("****************************************");
		System.out.println("*  1.Add New Account                   *");
		System.out.println("*  2.Show List of Account              *");
		System.out.println("*  3.Undo                              *");
		System.out.println("*  4.Logout                            *");
		System.out.println("*  5.Exit                              *");
		System.out.println("****************************************");
		do {
			System.out.print("\nYour choose => Enter:  ");
			tam = input.nextInt();
		} while (tam < 1 || tam > 5);

		switch (tam) {
		case 1:
			Account.addAccount();
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
					ManagerManageInfo.manageAccount();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					break;
				}
			break;
		case 2:
			Account.showAccount();
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			int s1;
			do {
				System.out.print("\nYour choose => Enter:  ");
				s1 = input.nextInt();
			} while (s1 < 1 || s1 > 3);
			switch (s1) {
				case 1:
					Athleti.frameAthleti();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					break;
				}
				break;
			case 3:
			ManagerManageInfo.frameManager();
			break;
		case 4:
			User.Giaodien();
			break;
		case 5:
			break;
		}
	}

	public static void themsuaxoaSport() {
		Scanner input = new Scanner(System.in);

		System.out.println("****************************************");
		System.out.println("*   1.Add New Sport                    *");
		System.out.println("*   2.Delete Sport                     *");
		System.out.println("*   3.Edit Sport Information           *");
		System.out.println("*   4.Undo                             *");
		System.out.println("*   5.Logout                           *");
		System.out.println("*   6.Exit                             *");
		System.out.println("****************************************");
		int temp;
		do {
			System.out.print("\nYour choose => Enter:  ");
			temp = input.nextInt();
		} while (temp < 1 || temp > 6);

		switch (temp) {
			case 1:
				UseSport.addSport();
				break;
			case 2:
				UseSport.deleteSport();
				break;
			case 3:
				UseSport.edit();
				break;
			case 4:
				ManagerManageInfo.managerSport();
				break;
			case 5:
				User.Giaodien();
				break;
			case 6:
				break;
		}
	}

	// ======Athletic==========
	public static void addAthletes() {
		String name;
		String gender;
		String date;
		String sport;

		Scanner input = new Scanner(System.in);
		System.out.println("==========ADD NEW ATHLETES==========\n\n");
		System.out.println("Name Athleti: ");
		name = input.next();
		System.out.println("Name Gender: ");
		gender = input.next();
		System.out.println("Name Date: ");
		date = input.next();
		System.out.println("Name Sport: ");
		sport = input.next();

		Athleti athleti1 = new Athleti(name, gender, date, sport);
		Athleti.arrAthleti.add(athleti1);
		Account.addAccount(name, "12345");

		System.out.println("Added Successfully! \n");
		System.out.println("Choose:    1.Continue Add");
		System.out.println("           2.Undo");
		System.out.println("           3.Logout");
		System.out.println("           4.Exit");
		int d;
		do {
			System.out.print("\nYour choose => Enter:  ");
			d = input.nextInt();
		} while (d < 1 || d > 5);

		switch (d) {

		case 1:
			addAthletes();
			break;
		case 2:
			ManagerManageInfo.manageInformationOfAthletis();
			break;
		case 3:
			User.Giaodien();
			break;
		case 4:
			break;
		}

	}

	public static void timKiemVDV() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("==========SEARCH ATHLETES==========");
		System.out.println("\n");
		System.out.print("Enter the athlete ID that you want to find: ");
		int tempId = input.nextInt();
		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			if (tempId == Athleti.arrAthleti.get(i).getId()) {
				System.out.println(Athleti.arrAthleti.get(i).toString());
				int s;
				do {
					System.out.println("Choose:    1.Continue Search");
					System.out.println("           2.Undo");
					System.out.println("           3.Logout");
					System.out.println("           4.Exit");
					s = input.nextInt();
				} while (s < 1 || s > 4);
				switch (s) {
					case 1:
						timKiemVDV();
						break;
					case 2:
						ManagerManageInfo.manageInformationOfAthletis();
						break;
					case 3:
						User.Giaodien();
						break;
					case 4:
						break;
					}
				break;
			}
		}
		int s;
		do {
			System.out.println("ID does not exist in the system! \n");
			System.out.println("Choose:    1.Enter ID again");
			System.out.println("           2.Undo");
			System.out.println("           3.Logout");
			System.out.println("           4.Exit");
			s = input.nextInt();
		} while (s < 1 || s > 4);
		switch (s) {
			case 1:
				timKiemVDV();
				break;
			case 2:
				ManagerManageInfo.manageInformationOfAthletis();
				break;
			case 3:
				User.Giaodien();
				break;
			case 4:
				break;
		}
	}

	public static void showVDV() {
		System.out.println("==========LIST OF ATHLETES==========");
		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			System.out.println(Athleti.arrAthleti.get(i).toString());
		}
		System.out.println("\n");
	}

	public static void editThongTinVDV() {
		Scanner input = new Scanner(System.in);
		System.out.println("==========EDIT INFORMATION OF ATHLETES==========");
		System.out.println();
		System.out.println("What do you want to edit?");
		System.out.println();
		System.out.println("1. Edit Name Athletes: ");
		System.out.println("2. Edit Gender Athletes");
		System.out.println("3. Edit Date Athletes");
		System.out.println("4. Edit Sport Athletes");

		System.out.println();
		System.out.println("Choose:    5.Undo");
		System.out.println("           6.Exit");
		System.out.println("           7.Logout");
		int inE;
		do {
			System.out.print("\nYour choose => Enter:  ");
			inE = input.nextInt();
		} while (inE < 1 || inE > 6);

		switch (inE) {
		case 1:
			System.out.println("=====Edit Name Sport=====");
			showVDV();
			System.out.print("Enter Athlete ID that you want to edit name: ");
			int tempId = input.nextInt();
			System.out.print("Enter New Name: ");
			String tempName = input.next();

			for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
				if (tempId == Athleti.arrAthleti.get(i).getId()) {
					Athleti.arrAthleti.get(i).setName(tempName);
					int s;

					System.out.println("Edited Successfully! \n");
					System.out.println("Choose:    1.Undo");
					System.out.println("           2.Logout");
					System.out.println("           3.Exit");
					do {
						System.out.print("\nYour choose => Enter:  ");

						s = input.nextInt();
					} while (s < 1 || s > 3);
					switch (s) {
						case 1:
							editThongTinVDV();
							break;
						case 2:
							User.Giaodien();
							break;
						case 3:
							break;
					}
				}
			}
			int s;

			System.out.println("ID does not exist in the system! \n");
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");

				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
				case 1:
					editThongTinVDV();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					break;
			}

		case 2:
			System.out.println("=====Edit Gender Athletes=====");
			showVDV();
			System.out.print("Enter Athlete ID that you want to change gender: ");
			tempId = input.nextInt();
			System.out.print("Enter new gender: ");
			String tempGender = input.next();
			for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
				if (tempId == Athleti.arrAthleti.get(i).getId()) {
					Athleti.arrAthleti.get(i).setGender(tempGender);
					System.out.println("Edited Successfully! \n");
					System.out.println("Choose:    1.Undo");
					System.out.println("           2.Logout");
					System.out.println("           3.Exit");
					do {
						System.out.print("\nYour choose => Enter:  ");

						s = input.nextInt();
					} while (s < 1 || s > 3);
					switch (s) {
						case 1:
							editThongTinVDV();
							break;
						case 2:
							User.Giaodien();
							break;
						case 3:
							break;
					}
				}
			}

			System.out.println("ID does not exist in the system! \n");
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				editThongTinVDV();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				break;
			}

		case 3:
			System.out.println("=====Edit DOB of Atheletes=====");

			showVDV();
			System.out.print("Enter Athlete ID that you want to edit DOB: ");
			tempId = input.nextInt();
			System.out.print("Enter New DOB ('day-month-year'): ");
			String tempDate = input.next();
			for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
				if (tempId == Athleti.arrAthleti.get(i).getId()) {
					Athleti.arrAthleti.get(i).setDate(tempDate);

					System.out.println("Edited Successfully! \n");
					System.out.println("Choose:    1.Undo");
					System.out.println("           2.Logout");
					System.out.println("           3.Exit");
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 3);
					switch (s) {
						case 1:
							editThongTinVDV();
							break;
						case 2:
							User.Giaodien();
							break;
						case 3:
							break;
					}
				}

			}

			System.out.println("ID does not exist in the system! \n");
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
				case 1:
					editThongTinVDV();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					break;
			}
		case 4:
			System.out.println("=====Edit Sport of Athletes=====");
			showVDV();
			System.out.print("Enter Athlete ID that you want to edit of sport: ");
			tempId = input.nextInt();
			System.out.print("Enter New Name Sport: ");
			String tempNameSport = input.next();
			for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
				if (tempId == Athleti.arrAthleti.get(i).getId()) {
					Athleti.arrAthleti.get(i).setSport(tempNameSport);

					System.out.println("Edited Successfully! \n");
					System.out.println("Choose:    1.Undo");
					System.out.println("           2.Logout");
					System.out.println("           3.Exit");
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 3);
					switch (s) {
					case 1:
						editThongTinVDV();
						break;
					case 2:
						User.Giaodien();
						break;
					case 3:
						break;
					}
				}

			}

			System.out.println("ID does not exist in the system! \n");
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
			case 1:
				editThongTinVDV();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				break;
			}

		case 5:
			editThongTinVDV();
			break;
		case 6:
			break;
		case 7:
			User.Giaodien();
			break;
		}
	}

	public static void deleteAthleti() {
		Scanner input = new Scanner(System.in);

		System.out.println("=====DELETE ATHLETES=====");
		System.out.println("\n");
		showVDV();
		System.out.print("Please enter ID and athletes name you want to delete: ");
		System.out.print("\tEnter ID Athletes: ");
		int tempId = input.nextInt();
		System.out.print("\tEnter Name Athletes: ");
		String tempName = input.next();

		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			if (tempId == Athleti.arrAthleti.get(i).getId()) {
				if (tempName.equals(Athleti.arrAthleti.get(i).getName())) {
					Athleti.arrAthleti.remove(i);
					
					System.out.println("Deleted Successfully! \n");
					System.out.println("Choose:    1.Continue delete");
					System.out.println("           2.Undo");
					System.out.println("           3.Logout");
					System.out.println("           4.Exit");
					int s;
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 4);
					switch (s) {
						case 1:
							deleteAthleti();
							break;
						case 2:
							ManagerManageInfo.manageInformationOfAthletis();
							break;
						case 3:
							User.Giaodien();
							break;
						case 4:
							break;
					}
					break;
				} else {
					System.out.println("ID and name you entered do not match the system! \n");
					System.out.println("Choose:    1.Enter again");
					System.out.println("           2.Undo");
					System.out.println("           3.Logout");
					System.out.println("           4.Exit");
					int s;
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 4);
					switch (s) {
						case 1:
							deleteAthleti();
							break;
						case 2:
							ManagerManageInfo.manageInformationOfAthletis();
							break;
						case 3:
							User.Giaodien();
							break;
						case 4:
							break;
					}
				}
			}
		}

		System.out.println("ID and name you entered do not match the system! \n");
		System.out.println("Choose:    1.Enter again");
		System.out.println("           2.Undo");
		System.out.println("           3.Logout");
		System.out.println("           4.Exit");
		int s;
		do {
			System.out.print("\nYour choose => Enter:  ");
			s = input.nextInt();
		} while (s < 1 || s > 4);
		switch (s) {
			case 1:
				deleteAthleti();
				break;
			case 2:
				ManagerManageInfo.manageInformationOfAthletis();
				break;
			case 3:
				User.Giaodien();
				break;
			case 4:
				break;
		}
	}

	// ======Coach==========
	public static void addCoach() {
		String name;
		String gender;
		String date;
		String sport;

		Scanner input = new Scanner(System.in);
		System.out.println("==========ADD NEW COACH==========\n\n");
		System.out.println("Enter Coach Name: ");
		name = input.next();
		System.out.println("Enter Coach Gender: ");
		gender = input.next();
		System.out.println("Enter Coach DOB: ");
		date = input.next();
		System.out.println("Enter Name Sport: ");
		sport = input.next();

		Coach coach = new Coach(name, gender, date, sport);
		Coach.arrCoach.add(coach);

		System.out.println("Added Successfully! \n");
		System.out.println("Choose:    1.Continue add");
		System.out.println("           2.Undo");
		System.out.println("           3.Exit");
		System.out.println("           4.Logout");
		int d;
		do {
			System.out.print("\nYour choose => Enter:  ");
			d = input.nextInt();
		} while (d < 1 || d > 4);
		switch (d) {
			case 1:
				addCoach();
				break;
			case 2:
				ManagerManageInfo.manageInfomationOfCoach();
				break;
			case 3:
				break;
			case 4:
				User.Giaodien();
				break;
		}
	}

	public static void timKiemCoach() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====SEARCH COACH=====");
		System.out.println("\n");
		System.out.print("Enter Coach ID that you want to find: ");
		int tempId = input.nextInt();
		for (int i = 0; i < Coach.arrCoach.size(); i++) {
			if (tempId == Coach.arrCoach.get(i).getId()) {
				System.out.println(Coach.arrCoach.get(i).toString());

				System.out.println("Choose:    1.Continue Search");
				System.out.println("           2.Undo");
				System.out.println("           3.Logout");
				System.out.println("           4.Exit");
				int s;
				do {
					System.out.print("\nYour choose => Enter:  ");
					s = input.nextInt();
				} while (s < 1 || s > 4);

				switch (s) {
				case 1:
					timKiemVDV();
					break;
				case 2:
					ManagerManageInfo.manageInfomationOfCoach();
					break;
				case 3:
					User.Giaodien();
					break;
				case 4:
					break;
				}
				break;
			}
		}
		System.out.println("ID does not exist in the system! \n");
		System.out.println("Choose:    1.Enter ID again");
		System.out.println("           2.Undo");
		System.out.println("           3.Logout");
		System.out.println("           4.Exit");
		int s;
		do {
			System.out.print("\nYour choose => Enter:  ");
			s = input.nextInt();
		} while (s < 1 || s > 4);
		switch (s) {
			case 1:
				timKiemVDV();
				break;
			case 2:
				ManagerManageInfo.manageInfomationOfCoach();
				break;
			case 3:
				User.Giaodien();
				break;
			case 4:
				break;
		}
	}

	public static void showCoach() {
		System.out.println("==========LIST OF COACH==========");
		for (int i = 0; i < Coach.arrCoach.size(); i++) {
			System.out.println(Coach.arrCoach.get(i).toString());
		}
		System.out.println("\n");
	}

	public static void editThongTinCoach() {
		Scanner input = new Scanner(System.in);
		System.out.println("=====EDIT INFORMATION OF COACH=====");
		System.out.println("\n");
		System.out.println("What do you want to edit ?");
		System.out.println("\n");
		System.out.println("1. Edit Coach Name: ");
		System.out.println("2. Edit Coach Gender: ");
		System.out.println("3. Edit Coach DOB: ");

		System.out.println("\n");
		System.out.println("Choose:    4.Undo");
		System.out.println("           5.Logout");
		System.out.println("           6.Exit");
		int inE;
		do {
			System.out.print("\nYour choose => Enter:  ");
			inE = input.nextInt();
		} while (inE < 1 || inE > 6);
		switch (inE) {
		case 1:
			System.out.println("===Edit Coach Name===");
			showVDV();
			System.out.print("Enter Coach ID that you want to edit name: ");
			int tempId = input.nextInt();
			System.out.print("Enter New Name: ");
			String tempName = input.next();

			for (int i = 0; i < Coach.arrCoach.size(); i++) {
				if (tempId == Coach.arrCoach.get(i).getId()) {
					Coach.arrCoach.get(i).setName(tempName);

					System.out.println("Edited Successfully! \n");
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
							editThongTinCoach();
							break;
						case 2:
							User.Giaodien();
							break;
						case 3:
							break;
					}
				}
			}

			System.out.println("ID does not exist in the system! \n");
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
				editThongTinCoach();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				break;
			}

		case 2:
			System.out.println("===Edit Coach Gender===");
			showVDV();
			System.out.print("Enter Coach ID that you want to edit gender: ");
			tempId = input.nextInt();
			System.out.print("Enter New Gender: ");
			String tempGender = input.next();
			for (int i = 0; i < Coach.arrCoach.size(); i++) {
				if (tempId == Coach.arrCoach.get(i).getId()) {
					Coach.arrCoach.get(i).setGender(tempGender);
					System.out.println("Edited Successfully!\n");
					System.out.println("Choose:    1.Undo");
					System.out.println("           2.Logout");
					System.out.println("           3.Exit");
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 3);
					switch (s) {
					case 1:
						editThongTinCoach();
						break;
					case 2:
						User.Giaodien();
						break;
					case 3:
						break;
					}
				}
			}

			System.out.println("ID does not exist in the system! \n");
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
				case 1:
					editThongTinCoach();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					break;
			}

		case 3:
			System.out.println("===Edit Coach DOB===");

			showVDV();
			System.out.print("Enter Coach ID that you want to edit DOB: \n");
			tempId = input.nextInt();
			System.out.print("Enter New DOB ('day-month-year'): \n");
			String tempDate = input.next();
			for (int i = 0; i < Coach.arrCoach.size(); i++) {
				if (tempId == Coach.arrCoach.get(i).getId()) {
					Coach.arrCoach.get(i).setDate(tempDate);
					System.out.println("Edited Successfully! \n");
					System.out.println("Choose:    1.Undo");
					System.out.println("           2.Logout");
					System.out.println("           3.Exit");
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 3);
					switch (s) {
					case 1:
						editThongTinCoach();
						break;
					case 2:
						User.Giaodien();
						break;
					case 3:
						break;
					}
				}
			}

			System.out.println("ID does not exist in the system! \n");
			System.out.println("Choose:    1.Undo");
			System.out.println("           2.Logout");
			System.out.println("           3.Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);
			switch (s) {
				case 1:
					editThongTinCoach();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					break;
			}

		case 4:
			ManagerManageInfo.frameManager();
			break;
		case 5:
			User.Giaodien();
			break;
		case 6:
			break;
		}

	}

	public static void deleteCoach() {
		Scanner input = new Scanner(System.in);
		System.out.println("=====DELETE COACH=====");
		System.out.println("\n");
		showCoach();
		System.out.print("Please enter ID and Coach name you want to delete: ");
		System.out.print("\tEnter Coach ID: ");
		int tempId = input.nextInt();
		System.out.print("\tEnter Coach Name: ");
		String tempName = input.next();

		for (int i = 0; i < Coach.arrCoach.size(); i++) {
			if (tempId == Coach.arrCoach.get(i).getId()) {
				if (tempName.equals(Coach.arrCoach.get(i).getName())) {
					Coach.arrCoach.remove(i);
					System.out.println("Deleted Successfully! \n");
					System.out.println("Choose:    1.Continue delete");
					System.out.println("           2.Undo");
					System.out.println("           3.Logout");
					System.out.println("           4.Exit");
					int s;
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 4);
					switch (s) {
						case 1:
							deleteCoach();
							break;
						case 2:
							ManagerManageInfo.manageInfomationOfCoach();
							break;
						case 3:
							User.Giaodien();
							break;
						case 4:
							break;
					}
					break;
				} else {
					System.out.println("ID and name you entered do not match the system! \n");
					System.out.println("Choose:    1.Enter again");
					System.out.println("           2.Undo");
					System.out.println("           3.Logout");
					System.out.println("           4.Exit");
					int s;
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 4);
					switch (s) {
					case 1:
						deleteCoach();
						break;
					case 2:
						ManagerManageInfo.manageInfomationOfCoach();
						break;
					case 3:
						User.Giaodien();
						break;
					case 4:
						break;
					}
				}
			}
		}
		System.out.println("Deleted Successfully! \n");
		System.out.println("Ban muon   1.Tiep tuc xoa");
		System.out.println("           2.Quay lai truoc do");
		System.out.println("           3.Dang xuat");
		System.out.println("           4.Exit");
		System.out.println("Choose:    1.Continue delete");
		System.out.println("           2.Undo");
		System.out.println("           3.Logout");
		System.out.println("           4.Exit");
		int s;
		do {
			System.out.print("\nYour choose => Enter:  ");
			s = input.nextInt();
		} while (s < 1 || s > 4);
		switch (s) {
			case 1:
				deleteCoach();
				break;
			case 2:
				ManagerManageInfo.manageInfomationOfCoach();
				break;
			case 3:
				User.Giaodien();
				break;
			case 4:
				break;
		}
	}

	// ==============Add Medal============
	public static void addMedal() {
		Scanner input = new Scanner(System.in);
		String name;
		String sport;
		System.out.println("****************************************");
		System.out.println("*              ADD MEDAL               *");
		System.out.println("****************************************");
		System.out.println("\n\n");
		System.out.println("Enter Medal Name: ");
		name = input.next();
		System.out.println("\n");
		System.out.println("Enter Sport: ");
		sport = input.next();

		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			if (name.equals(Athleti.arrAthleti.get(i).getName())) {
				if (sport.equals(Athleti.arrAthleti.get(i).getSport())) {
					for (int j = 0; j < Sport.arrSport.size(); j++) {
						if (sport.equals(Sport.arrSport.get(j).getName())) {

							System.out.println("Enter Medal for Athletes: ");
							String title = input.next();
							Athleti.arrAthleti.get(i).setTitle(title);
							Athleti.arrAthleti.get(i).setReward(UseSport.arrSport.get(j).getReward(title));

							System.out.println("Added Successfully!");
							System.out.println("\n");
							System.out.println("Choose:    1.Continue add");
							System.out.println("           2.Undo");
							System.out.println("           3.Logout");
							System.out.println("           4.Exit");
							int s;
							do {
								System.out.print("\nYour choose => Enter:  ");
								s = input.nextInt();
							} while (s < 1 || s > 4);

							switch (s) {
							case 1:
									addMedal();
									break;
								case 2:
									ManagerManageInfo.frameManager();
									break;
								case 3:
									User.Giaodien();
									break;
								case 4:
									break;
							}
						} else {
							System.out.println("Name Athletes or Name Sport incorrect, please try again! ");
							System.out.println("Choose:    1. Enter again");
							System.out.println("           2. Undo");
							System.out.println("           3. Logout");
							System.out.println("           4. Exit");
							int s;
							do {
								System.out.print("\nYour choose => Enter:  ");
								s = input.nextInt();
							} while (s < 1 || s > 4);
							switch (s) {
								case 1:
									addMedal();
									break;
								case 2:
									ManagerManageInfo.frameManager();
									break;
								case 3:
									User.Giaodien();
									break;
								case 4:
									break;
							}
						}
					}
				}
			}
		}
	}

	// ===================salary===========
	public static void manageSalary() {
		Scanner input = new Scanner(System.in);

		System.out.println("****************************************");
		System.out.println("*            MANAGE SALARY             *");
		System.out.println("****************************************");
		System.out.println("\n\n");
		System.out.println("****************************************");
		System.out.println("*    1. Show Basic Salary              *");
		System.out.println("*    2. Edit Basic Salary              *");
		System.out.println("*    3. Show Reward                    *");
		System.out.println("*    4. Logout                         *");
		System.out.println("*    5. Exit                           *");
		System.out.println("****************************************");

		int temp;
		do {
			System.out.print("\nYour choose => Enter:  ");
			temp = input.nextInt();
		} while (temp < 1 || temp > 5);
		switch (temp) {
			case 1:
				showSalary();
				break;
			case 2:
				UseSport.editSalary();
				break;
			case 3:
				showReward();
				break;
			case 4:
				User.Giaodien();
				break;
			case 5:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
		}
	}

	public static void showSalary() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			for (int j = 0; j < Sport.arrSport.size(); j++) {
				if (Athleti.arrAthleti.get(i).getSport().equals(Sport.arrSport.get(j).getName())) {
					System.out.println("Name Athleti:   " + Athleti.arrAthleti.get(i).getName());
					System.out.println("Basic Salary:   " + Sport.arrSport.get(j).getBasicSalary() + "\n");
				}
			}
		}
		System.out.println("\n");
		System.out.println("Choose:    1. Undo");
		System.out.println("           2. Logout");
		System.out.println("           3. Exit");
		int s;
		do {
			System.out.print("\nYour choose => Enter:  ");
			s = input.nextInt();
		} while (s < 1 || s > 3);
		switch (s) {
			case 1:
				ManagerManageInfo.manageSalary();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
		}
	}

	public static void showReward() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < Athleti.arrAthleti.size(); i++) {
			System.out.println("Name Athleti:   " + Athleti.arrAthleti.get(i).getName());
			System.out.println("Reward:   " + Athleti.arrAthleti.get(i).getReward() + "\n");
		}
		System.out.println("\n");

		System.out.println("Choose:    1. Undo");
		System.out.println("           2. Logout");
		System.out.println("           3. Exit");
		int s;
		do {
			System.out.print("\nYour choose => Enter:  ");
			s = input.nextInt();
		} while (s < 1 || s > 3);

		switch (s) {
			case 1:
				ManagerManageInfo.manageSalary();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
		}
	}

	// ================= Calendar==============
	public static void Calendar() {
		System.out.println("****************************************");
		System.out.println("*            MANAGE CALENDAR           *");
		System.out.println("****************************************");
		System.out.println("\n\n");

		System.out.println("****************************************");
		System.out.println("*   1.Add Match Calendar               *");
		System.out.println("*   2.Add Practice Calendar            *");
		System.out.println("*   3.Show Match Calendar              *");
		System.out.println("*   4.Show Practice Calendar           *");
		System.out.println("*   5.Undo                             *");
		System.out.println("*   6.Logout                           *");
		System.out.println("*   7.Exit                             *");
		System.out.println("****************************************");
		Scanner input = new Scanner(System.in);
		int c;
		do {
			System.out.print("\nYour choose => Enter:  ");
			c = input.nextInt();
		} while (c < 1 || c > 7);

		switch (c) {
		case 1:
			Calendar.MatchCalendar();
			System.out.println("Choose:    1. Undo");
			System.out.println("           2. Logout");
			System.out.println("           3. Exit");
			int s;
			do {
				System.out.print("\nYour choose => Enter: ");
				s = input.nextInt();
			} while (s < 1 || s > 3);

			switch (s) {
				case 1:
					ManagerManageInfo.Calendar();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					System.out.println(" Program finished! 'Ctrl+F11' to run again");
					break;
			}
			break;
		case 2:
			Calendar.PracticeCalendar();
			System.out.println("Choose:    1. Undo");
			System.out.println("           2. Logout");
			System.out.println("           3. Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);

			switch (s) {
				case 1:
					ManagerManageInfo.Calendar();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					System.out.println(" Program finished! 'Ctrl+F11' to run again");
					break;
				}
			break;
		case 3:
			Calendar.showMatch();
			System.out.println("Choose:    1. Undo");
			System.out.println("           2. Logout");
			System.out.println("           3. Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);

			switch (s) {
				case 1:
					ManagerManageInfo.Calendar();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					System.out.println(" Program finished! 'Ctrl+F11' to run again");
					break;
				}
			break;
		case 4:
			Calendar.showPractice();
			System.out.println("Choose:    1. Undo");
			System.out.println("           2. Logout");
			System.out.println("           3. Exit");
			do {
				System.out.print("\nYour choose => Enter:  ");
				s = input.nextInt();
			} while (s < 1 || s > 3);

			switch (s) {
			case 1:
					ManagerManageInfo.Calendar();
					break;
				case 2:
					User.Giaodien();
					break;
				case 3:
					System.out.println(" Program finished! 'Ctrl+F11' to run again");
					break;
				}
			break;
		case 5:
			ManagerManageInfo.frameManager();
			break;
		case 6:
			User.Giaodien();
			break;
		case 7:
			break;
		}
	}

}