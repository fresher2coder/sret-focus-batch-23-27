package recursion;

public class DigitSum {

    // Recursive method to sum digits
    public int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        DigitSum ds = new DigitSum();

        int num = 12345;
        int sum = ds.sumOfDigits(num);

        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}

