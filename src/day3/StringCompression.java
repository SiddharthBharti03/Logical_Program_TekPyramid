package day3;

import java.util.Scanner;

public class StringCompression {
    public static void printStringCompression(String s) {
        s = s.toLowerCase().trim();
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println("Compressed string: " + compressed.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        printStringCompression(s);
    }
}