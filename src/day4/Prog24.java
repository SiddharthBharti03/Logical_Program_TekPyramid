package day4;

import java.util.Scanner;

public class Prog24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.println(getSumDigits(n));
    }
    public static int getSumDigits(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n/=10;
        }
        return sum;
    }
}
