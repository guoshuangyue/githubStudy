package javaStudy.thingking.java.Case;

import java.io.PrintStream;
import java.util.Random;

public class Chapter3 {

	private static Chapter3 test = new Chapter3();

	private PrintStream print = System.out;

	public Chapter3() {

	}

	public static void main(String[] args) {
		// test for method operators()
		// test.operators();

		// test for method operators()
		// test.assigment();

		// test for method passObject
		// test.passObject();

		// test for method MathOps
		test.MathOps();
	}

	public class Tank {
		int level;
	}

	public class Letter {
		char c;
	}

	private void operators() {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);
		print.println("a = " + a + "\n" + "b = " + b);
	}

	private void assigment() {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 88;
		print.println("1:t1.level: " + t1.level + ";t2.level: " + t2.level);

		t1 = t2;
		print.println("2:t1.level: " + t1.level + ";t2.level: " + t2.level);

		t1.level = 444;
		print.println("2:t1.level: " + t1.level + ";t2.level: " + t2.level);
	}

	private static void f(Letter le) {
		le.c = 'z';
	}

	private void passObject() {
		Letter x = new Letter();
		x.c = 'a';
		print.println("1:x.c: " + x.c);

		f(x);
		print.println("2:x.c: " + x.c);
	}

	private void MathOps() {
		// Create a seeded random number generator;
		Random rand = new Random();
		int i, j, k;
		// Choose value from 1 to 100
		j = rand.nextInt(100) + 1;
		print.println("j: " + j);
		k = rand.nextInt(100) + 1;
		print.println("k: " + k);
		i = j + k;
		print.print("j+k: " + i);
		i = j - k;
		print.println("j-k: " + i);
		i = j / k;
		print.println("j/k: " + i);
		i = j * k;
		print.println("j*k" + i);
		i = j % k;
		print.println("j%k" + i);
		j %= k;
		print.println("j%=k" + i);
		// Floating-point number testes;
		float u, v, w;// Applies to doubles. too
		v = rand.nextFloat();
		print.println("v=" + v);
		w = rand.nextFloat();
		print.println("w=" + w);
		u = v + w;
		print.println("v+w:" + u);
		u = v - w;
		print.println("v-w:" + u);
		u = v * w;
		print.println("v*w:" + u);
		u = v / w;
		print.println("v/w:" + u);
		// The following alse works for char,byte ,int,short,long,and double
		u += v;
		print.println("u+=v:" + u);
		u -= v;
		print.println("u-=v:" + u);
		u *= v;
		print.println("u*=v:" + u);
		u /= v;
		print.println("u/=v:" + u);
	}
}
