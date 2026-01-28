package day3;

import java.util.Scanner;

public class NonRepeating {
    public static void printNonRepeating(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        char[] ch = s.toCharArray();

        System.out.println("Non-repeating characters are:");
        for (int i = 0; i < ch.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.println(ch[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        printNonRepeating(s);
    }
}