package day2;

import java.util.Scanner;

public class ReplaceSpace {
    public static  void printStringWithoutSpace(String s,char ch){
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c == ' ') {
                result += ch;
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        System.out.println("Enter the Specific Character : ");
        char c=sc.nextLine().charAt(0);
        printStringWithoutSpace(s,c);
    }
}
