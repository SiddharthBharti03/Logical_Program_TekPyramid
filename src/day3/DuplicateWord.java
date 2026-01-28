package day3;

import java.util.Scanner;

public class DuplicateWord {
    public static  void printDuplicateWord(String s){
        String [] s1=s.trim().split("\\s+");
        int len=s1.length-1;
        for(int i=0;i<=len;i++){
            for(int j=i+1;j<=len;j++){
                if(s1[i].equalsIgnoreCase(s1[j])){
                    System.out.println(s1[i]);
                    s1[j]=s1[len];
                    len--;
                    j--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        printDuplicateWord(s);
    }
}
