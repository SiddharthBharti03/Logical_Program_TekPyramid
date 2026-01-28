package day4;

public class Prog20 {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD is: " + a);
    }
}
