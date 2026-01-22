package day2;

import java.util.Scanner;

public class GetAllSubset {
    public static void printAllSubset(String s){
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            String subset="";
            for(int j=i;j<c.length;j++){
                subset=subset+c[j];
                System.out.println(subset);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        printAllSubset(s);
    }
}
