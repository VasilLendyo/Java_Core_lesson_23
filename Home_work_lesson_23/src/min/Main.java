package min;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		VerhovnaRada rada = new VerhovnaRada().getInstance();
		Faction faction = new Faction(null);

		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			String next = sc.next();
			switch (next) {
			case "1": {
				rada.addFaction();
				break;
			}
			case "2": {
				rada.removeFaction();
				break;
			}
			case "3": {
				rada.printAllFaction();
				break;
			}
			case "4": {
				System.out.println("Enter name of faction");
				String name = sc.next();
				rada.getFactionList().stream().filter(e -> e.getName().equalsIgnoreCase(name)).findAny().get()
						.clearFaction();
				break;
			}
			case "5": {
				rada.printFaction();
				break;
			}
			case "6": {
				rada.addDeputyToFaction();
				break;
			}
			case "7": {
				rada.removeDeputyFromFaction();
				break;
			}
			case "8": {
				rada.printAllGrafters();
				break;
			}
			case "9": {
				rada.biggestGrafterFaction();
				break;
			}
			}
		}
	}

	public static void menu() {
		System.out.println("Enter 1, to add Faction");
		System.out.println("Enter 2, to remove faction");
		System.out.println("Enter 3, to print all faction");
		System.out.println("Enter 4, to clear the faction");
		System.out.println("Enter 5, to print faction");
		System.out.println("Enter 6, to add deputy to faction");
		System.out.println("Enter 7, to remove deputy from faction");
		System.out.println("Enter 8, to print all grafters");
		System.out.println("Enter 9, to print biggest grafter");
	}
}
