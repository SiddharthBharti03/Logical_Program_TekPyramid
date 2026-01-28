package day2;

import java.util.Scanner;

public class RotateString {
    public static boolean printRotateString(String s,String s1){
        if(s.length()!=s1.length()){
            return false;
        }
        String temp=s+s;
        if(temp.contains(s1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s=sc.nextLine();
        System.out.println("Enter the Second String : ");
        String s1=sc.nextLine();
        System.out.println(printRotateString(s,s1));
    }
}
