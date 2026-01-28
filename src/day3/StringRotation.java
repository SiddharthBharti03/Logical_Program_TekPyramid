package day3;

import java.util.Scanner;

public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String doubled = str1 + str1;


        return doubled.contains(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1);
        }
    }
}