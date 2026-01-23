package day3;

import java.util.Scanner;

public class ReverseStringWordByWord {
    public static  void printReverseString(String s){
        String st=s.toLowerCase();
        String rev="";
        String [] s1=st.trim().split("\\s+");
        for(int i=s1.length-1;i>=0;i--){
            rev=rev+s1[i]+" ";
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        printReverseString(s);
    }
}
