package lab1;

public class Reduce {
    public static void main(String[] args) {
        int steps = 0, n = 100;
        for (; n != 0; steps++) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        System.out.println(steps);
    }
}
