package day4;

import java.util.Scanner;

public class Prog18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        printFibonacci(n);
    }
    public static void printFibonacci(int n){

        int n1=0,n2=1;
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
