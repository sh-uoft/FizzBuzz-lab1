package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.print(multiples());
    }

    public static int multiples(int n, int a, int b) {
        n -= 1;
        if (a % b == 0) {
            return n / b;
        } else if (b % a == 0) {
            return n / a;
        } else {
            return n / a + n / b - n / (a * b);
        }
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
