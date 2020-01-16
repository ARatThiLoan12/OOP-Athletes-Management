
import java.util.Scanner;

public class UseSport extends Sport {

	public UseSport() {
		super();
	}

	public UseSport(String name, double basicSalary) {
		super(name, basicSalary);
	}

	public static void addSport() {
		String name1;
		double basicSalary1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== ADD SPORT =====\n\n");
		System.out.println("Enter Name Sport: ");
		name1 = input.next();
		System.out.println("Enter Basic Salary: ");
		basicSalary1 = input.nextDouble();
		Sport s1 = new Sport(name1, basicSalary1);
		arrSport.add(s1);

		System.out.println("Added Successfully! \n");
		System.out.println("Choose:    1.Continue Add");
		System.out.println("           2.Undo");
		System.out.println("           3.Exit");
		System.out.println("           4.Logout");
		int d;
		do {
			System.out.print("\nYour choose => Enter: ");
			d = input.nextInt();
		} while (d < 1 || d > 4);
		switch (d) {
			case 1:
				addSport();
				break;
			case 2:
				ManagerManageInfo.managerSport();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
			case 4:
				User.Giaodien();
				break;
		}

	}

	public static void showListSport() {
		System.out.println("=== LIST OF SPORT ===\n\n");
		for (int i = 0; i < arrSport.size(); i++) {
			System.out.println(arrSport.get(i).toString());
		}
		System.out.println("\n");
	}

	public static void edit() {
		Scanner input = new Scanner(System.in);
		System.out.println("===== EDIT SPORT =====\n\n");
		System.out.println("What do you want to edit? \n");
		System.out.println("1. Edit name sport");
		System.out.println("2. Edit basic salary of sport");
		System.out.println("\n");
		System.out.println("Choose:    3.Undo");
		System.out.println("           4.Exit");
		System.out.println("           5.Logout");
		int inE;
		do {
			System.out.print("\nYour choose => Enter:  ");
			inE = input.nextInt();
		} while (inE < 1 || inE > 4);

		switch (inE) {
			case 1: {
				System.out.println("===Edit sport name===\n\n");
				showListSport();
				System.out.print("Enter Sport ID that you want to edit: ");
				int tempId = input.nextInt();
				System.out.print("Enter New Name: ");
				String tempName = input.next();
	
				for (int i = 0; i < arrSport.size(); i++) {
					if (tempId == arrSport.get(i).getId()) {
						arrSport.get(i).setName(tempName);
					} else {
						System.out.println("ID you entered does not exist in the system! \n");
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
							edit();
							break;
						case 2:
							User.Giaodien();
							break;
						case 3:
							System.out.println(" Program finished! 'Ctrl+F11' to run again");
							break;
						}
					}
				}
	
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
						edit();
						break;
					case 2:
						User.Giaodien();
						break;
					case 3:
						System.out.println(" Program finished! 'Ctrl+F11' to run again");
						break;
					}
			}
			
			case 2:
				editSalary();
				break;
			case 3:
				ManagerManageInfo.managerSport();
				break;
			case 4:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
			case 5:
				User.Giaodien();
				break;
		}
	}

	public static void editSalary() {
		Scanner input = new Scanner(System.in);
		System.out.println("===Edit basic salary of sport===\n\n");
		showListSport();
		System.out.print("Enter Sport ID that you want to edit: ");
		int tempId = input.nextInt();
		System.out.print("Enter New Basic Salary: ");
		double tempSalary = input.nextDouble();
		for (int i = 0; i < arrSport.size(); i++) {
			if (tempId == arrSport.get(i).getId()) {
				arrSport.get(i).setBasicSalary(tempSalary);
			} else {
				System.out.println("ID you entered does not exist in the system! \n");
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
						edit();
						break;
					case 2:
						User.Giaodien();
						break;
					case 3:
						System.out.println(" Program finished! 'Ctrl+F11' to run again");
						break;
				}
			}
		}
		System.out.println("Thay doi thanh cong \n");
		System.out.println("Ban muon   1.quay lai");
		System.out.println("           2.Logout");
		System.out.println("           3.Exit");
		int s;
		do {
			System.out.print("\nYour choose => Enter:  ");
			s = input.nextInt();
		} while (s < 1 || s > 3);
		switch (s) {
			case 1:
				edit();
				break;
			case 2:
				User.Giaodien();
				break;
			case 3:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
		}
	}

	public static void deleteSport() {
		Scanner input = new Scanner(System.in);

		System.out.println("===== DELETE SPORT =====\n\n");
		showListSport();
		System.out.print("Enter Sport ID and name that you want to delete: ");
		System.out.print("\tEnter Sport ID: ");
		int tempId = input.nextInt();
		System.out.print("\tEnter Sport Name: ");
		String tempName = input.next();

		for (int i = 0; i < arrSport.size(); i++) {
			if (tempId == arrSport.get(i).getId()) {
				if (tempName.equals(arrSport.get(i).getName())) {
					arrSport.remove(i);
					break;
				} else {
					System.out.println("ID and name you entered does not exist in the system! \n");
					System.out.println("Choose:    1.Enter again");
					System.out.println("           2.Undo");
					System.out.println("           3.Dang xuat");
					System.out.println("           4.Exit");
					int s;
					do {
						System.out.print("\nYour choose => Enter:  ");
						s = input.nextInt();
					} while (s < 1 || s > 4);
					switch (s) {
						case 1:
							deleteSport();
							break;
						case 2:
							ManagerManageInfo.managerSport();
							break;
						case 3:
							User.Giaodien();
							break;
						case 4:
							System.out.println(" Program finished! 'Ctrl+F11' to run again");
							break;
					}
				}

			}
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
					deleteSport();
					break;
				case 2:
					ManagerManageInfo.managerSport();
					break;
				case 3:
					User.Giaodien();
					break;
				case 4:
					System.out.println(" Program finished! 'Ctrl+F11' to run again");
					break;
			}
		}
	}

	public static void timKiem() {
		Scanner input = new Scanner(System.in);
		System.out.println("===== SEARCH SPORT =====");
		System.out.println("\n\n");
		System.out.print("Enter Sport ID that you want to search: ");
		int tempId = input.nextInt();
		for (int i = 0; i < arrSport.size(); i++) {
			if (tempId == arrSport.get(i).getId()) {
				System.out.println(arrSport.get(i).toString());

				System.out.println("Choose:    1.Continue search");
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
						timKiem();
						break;
					case 2:
						ManagerManageInfo.managerSport();
						break;
					case 3:
						User.Giaodien();
						break;
					case 4:
						System.out.println(" Program finished! 'Ctrl+F11' to run again");
						break;
					}
				break;
			}

		}
		System.out.println("ID you entered does not exist in the system! \n");
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
				timKiem();
				break;
			case 2:
				ManagerManageInfo.managerSport();
				break;
			case 3:
				User.Giaodien();
				break;
			case 4:
				System.out.println(" Program finished! 'Ctrl+F11' to run again");
				break;
		}
	}

}
