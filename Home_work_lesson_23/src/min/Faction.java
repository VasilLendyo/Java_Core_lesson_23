package min;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Faction {

	private List<Deputy> deputyList = new ArrayList<>();
	private String name;

	public Faction(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Faction [deputyList=" + deputyList + ", name=" + name + "]";
	}

	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name of deputy");
		String lastName = sc.next();
		System.out.println("Enter first name of deputy");
		String firstName = sc.next();
		System.out.println("Enter age of deputy");
		int age = sc.nextInt();
		System.out.println("Enter weight of deputy");
		int weight = sc.nextInt();
		System.out.println("Enter height of deputy");
		int height = sc.nextInt();
		System.out.println("Enter is grafter(true or false)");
		boolean grafter = sc.nextBoolean();
		deputyList.add(new Deputy(weight, height, lastName, firstName, age, grafter));
		System.out.println("Deputy is adding");
	}

	public void removeDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name of deputy");
		String inputLastName = sc.next();
		deputyList.removeIf(e -> e.getLastName().equalsIgnoreCase(inputLastName));
	}

	public void allGraftersFaction() {
		List<Deputy> isGrafter = deputyList.stream().filter(e -> e.isGrafter()).collect(Collectors.toList());
		System.out.println(isGrafter);
	}

	public void biggestGrafterFaction() {
		Optional<Deputy> max = deputyList.stream().max(Comparator.comparing(Deputy::getSizeOfBribe));
		if (max.isPresent()) {
			System.out.println(max.get());
		}
	}

	public void allDeputyFaction() {
		deputyList.stream().forEach(System.out::println);
	}

	public void clearFaction() {
		deputyList.clear();
	}
}
