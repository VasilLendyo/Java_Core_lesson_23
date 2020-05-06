package min;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VerhovnaRada {

	private static VerhovnaRada instance;

	public static synchronized VerhovnaRada getInstance() {
		if (instance == null) {
			instance = new VerhovnaRada();
		}
		return instance;
	}

	private List<Faction> factionList = new ArrayList<>();

	public List<Faction> getFactionList() {
		return factionList;
	}

	public void addFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();
		factionList.add(new Faction(name));
	}

	public void removeFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();
		factionList.removeIf(e -> e.getName().equalsIgnoreCase(name));
	}

	public void printAllFaction() {
		factionList.stream().forEach(System.out::println);
	}

	public void printFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();
		List<Faction> filter = factionList.stream().filter(e -> e.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
		System.out.println(filter);
	}

	public void addDeputyToFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();
		Optional<Faction> findAny = factionList.stream().filter(e -> e.getName().equalsIgnoreCase(name)).findAny();
		if (findAny.isPresent()) {
			findAny.get().addDeputy();
		}
	}

	public void removeDeputyFromFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();

		factionList.stream().filter(e -> e.getName().equalsIgnoreCase(name)).findAny().get().removeDeputy();
	}

	public void printAllGrafters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();

		factionList.stream().filter(e -> e.getName().equalsIgnoreCase(name)).findAny().get().allGraftersFaction();
	}

	public void biggestGrafterFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();

		factionList.stream().filter(e -> e.getName().equalsIgnoreCase(name)).findAny().get().biggestGrafterFaction();
	}

	public void printAllDeputyFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String name = sc.next();

		factionList.stream().filter(e -> e.getName().equalsIgnoreCase(name)).findAny().get().allDeputyFaction();
	}
}
