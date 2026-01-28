package day4;

import java.util.Scanner;

public class Prog13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to store in an array : ");
        int m=sc.nextInt();
        int[] b=new int[m];
        System.out.println("Enter second Array : ");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
       int[]i= getMergedArray(a,b);
        for(int x:i){
            System.out.println(x);
        }
    }
    public static int[] getMergedArray(int[] a,int[] b){
        int[] merged=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            merged[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            merged[a.length+i]=b[i];
        }
        return merged;
    }
}
