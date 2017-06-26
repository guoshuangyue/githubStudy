package javaStudy.thingking.java.Case;

public class Chapter4 {

	public Chapter4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int choose = 1;
		switch (choose) {
		case 0:
			whileTest();// Demonstrates the while loop
			break;
		case 1:
			listCharacters();// Demonstrates "for" loop by Listing
			break;
		case 2:
			break;
		}
	}

	private static void listCharacters() {
		for (char c = 0; c < 128; c++) {
			if (Character.isLowerCase(c)) {
				System.out.println("value:" + (int) c + " character: " + c);
			}
		}
	}

	private static void whileTest() {
		while (caondition()) {
			System.out.println("Inside 'while'");
		}
		System.out.println("Exited 'while'");
	}

	private static boolean caondition() {
		boolean result = Math.random() < 0.99;
		System.out.println(result + ", ");
		return result;
	}
}
