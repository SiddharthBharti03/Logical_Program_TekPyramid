package day2;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s){
        String st=s.toLowerCase();
        String str="";
        for(int i=st.length()-1;i>=0;i--){
            char ch=st.charAt(i);
            str=str+ch;
        }
        if(str.equals(st)){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
