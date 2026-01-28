package day4;

import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Largest Number is : "+getLargest(a));
    }
    public static int getLargest(int[] a){
        int max=a[0];
        for(int x:a){
            if(x>max)
                max=x;
        }
        return max;
    }
}
