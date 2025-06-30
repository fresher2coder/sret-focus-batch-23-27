package recursion;

public class DemoRecursion {

	public static void main(String[] args) {

		int n = 5;

		DemoRecursion obj = new DemoRecursion();
		obj.display(5);

		while (true) {

			if (n == 0)
				break;
			System.out.println("Loop: " + n--);
		}

		n = 5;
		int sum = 0;

		System.out.println("Recursion Sum: " + obj.sumOfNumbers(n));

		while (n > 0) {
			sum += n;
			n--;
		}
		System.out.println("Loop Sum: " + sum);

	}

	void display(int n) {

		// base condition
		if (n == 0)
			return;

		System.out.println("Recursion: " + n);// 5 4 3 2 1
		display(n - 1);
		System.out.println("Recursion: " + n);// 1 2 3 4 5

	}

	int sumOfNumbers(int n) {
		if (n == 0)
			return 0;

		return n + sumOfNumbers(n - 1);

	}
}
