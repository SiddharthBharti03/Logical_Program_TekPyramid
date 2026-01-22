package day2;

import java.util.Scanner;

public class MaxMinOccurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char maxChar = ' ';
        char minChar = ' ';
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (freq[c] > max) {
                max = freq[c];
                maxChar = c;
            }

            if (freq[c] < min && freq[c] > 0) {
                min = freq[c];
                minChar = c;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " (" + max + ")");
        System.out.println("Minimum occurring character: " + minChar + " (" + min + ")");
    }
}
