package day1;

import java.util.Scanner;

public class TotalPunctuation {
    public static int getTotalNumberPunctuation(String s){
        int count=0;
        String p="!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(ch==c){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        int total=getTotalNumberPunctuation(str);
        System.out.println(total);
    }
}
