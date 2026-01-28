package day4;

import java.util.Scanner;

public class Prog23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.println(isPerfectNumber(n));
    }
    public static boolean isPerfectNumber(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
