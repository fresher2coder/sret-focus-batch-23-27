package recursion;

public class DigitCounter {

    // Recursive method to count digits
    public int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        DigitCounter counter = new DigitCounter();

        int num = 123456;
        int count = counter.countDigits(num);

        System.out.println("Number of digits in " + num + " is: " + count);
    }
}
