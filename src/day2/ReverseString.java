package day2;

import java.util.Scanner;

public class ReverseString {
    public static void printReverseStringByCharacter(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        printReverseStringByCharacter(s);
    }
}
