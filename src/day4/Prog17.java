package day4;

import java.util.Scanner;

public class Prog17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.println(isPrimeNumber(n));
    }
    public static boolean isPrimeNumber(int n){
        if(n<1){
            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        else if(n%2==0){
            return false;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
