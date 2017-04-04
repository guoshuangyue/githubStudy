package javaStudy.thingking.java.Case;

public class Chapter3 {

	private static Chapter3 test = new Chapter3();

	public Chapter3() {

	}

	public static void main(String[] args) {
		// test for method operators()
		// test.operators();

		// test for method operators()
		test.assigment();
	}

	public class Tank {
		int level;
	}

	private void operators() {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);
		System.out.println("a = " + a + "\n" + "b = " + b);
	}

	private void assigment() {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 88;
		System.out.println("1:t1.level: " + t1.level + ";t2.level: " + t2.level);

		t1 = t2;
		System.out.println("2:t1.level: " + t1.level + ";t2.level: " + t2.level);

		t1.level = 444;
		System.out.println("2:t1.level: " + t1.level + ";t2.level: " + t2.level);
	}
}
