package day3;

import java.util.Scanner;

public class DigitContains {
    public static void printDigitContains(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch >=48 && ch<=57){
                count++;
            }
        }
        System.out.println("Number of Digit contains in a String : "+count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        printDigitContains(s);
    }
}
