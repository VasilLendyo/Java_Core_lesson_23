package min;

import java.util.Scanner;

public class Deputy extends Person {

	private String lastName;
	private String firstName;
	private int age;
	private boolean grafter;
	private int sizeOfBribe;

	public Deputy(int weight, int height, String lastName, String firstName, int age, boolean grafter) {
		super(weight, height);
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.grafter = grafter;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", grafter=" + grafter
				+ ", sizeOfBribe=" + sizeOfBribe + "]";
	}

	public void giveBribe() {
		if (grafter = false) {
			System.out.println("This deputy does not take bribes");
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of bribe do you give: ");
			int bribe = sc.nextInt();
			if (bribe > 5000) {
				System.out.println("Police detain the deputy");
			} else {
				sizeOfBribe = bribe;
			}
		}
	}
}
