package day4;

import java.util.Scanner;

public class Prog19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        printFactorial(n);
    }
    public static void printFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
