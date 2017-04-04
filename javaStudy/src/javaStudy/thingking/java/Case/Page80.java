package javaStudy.thingking.java.Case;

public class Page80 {

	private static Page80 test;
	private int i;
	private char m;

	public Page80() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		test = new Page80();
		test.testForPage89();
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}

	private void testForPage89() {

		System.out.println(i);
		System.out.println(m);
	}
}
