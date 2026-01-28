package day4;

public class Prog21 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int lcm = (a * b) / gcd(a, b);

        System.out.println("LCM is: " + lcm);
    }
}
