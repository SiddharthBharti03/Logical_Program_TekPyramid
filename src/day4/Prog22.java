package day4;

import java.util.Scanner;

public class Prog22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.println(isArmStrongNumber(n));
    }
    public static boolean isArmStrongNumber(int n){
        int temp=n;
        int arm=0;
        int count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        int temp1=n;
        while(temp1>0){
            int rem=temp1%10;
            arm=arm+getPower(rem,count);
            temp1/=10;
        }
        if(arm==n){
            return true;
        }
        return false;
    }
    public static int getPower(int rem,int count){
        int pow=1;
        for(int i=0;i<count;i++){
            pow=pow*rem;
        }
        return pow;
    }
}
