package day3;

import java.util.Scanner;

public class LongestSubstring {
    public static void findLongestSubstring(String s) {
        s = s.trim();
        int maxLength = 0;
        String longest = "";


        for (int i = 0; i < s.length(); i++) {
            String current = "";


            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);


                if (current.indexOf(c) != -1) {
                    break;
                }
                current = current + c;


                if (current.length() > maxLength) {
                    maxLength = current.length();
                    longest = current;
                }
            }
        }

        System.out.println("Longest substring without repeating characters: " + longest);
        System.out.println("Length: " + maxLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        findLongestSubstring(s);
    }
}
