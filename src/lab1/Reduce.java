package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    private static int reduce(int n) {
        int steps = 0;
        for (; n != 0; steps++) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        return steps;
    }
}
