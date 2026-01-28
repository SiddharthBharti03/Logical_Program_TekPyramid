package day4;

import java.util.Scanner;

public class Prog11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Target : ");
        int target=sc.nextInt();
        printTargetAdd(a,target);
    }
    public static void printTargetAdd(int[] a ,int target){
        boolean found=false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target)
                {
                    System.out.println("Pair found: " + a[i] + " + " + a[j] + " = " + target);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No pair found with sum " + target);
        }
    }
}
