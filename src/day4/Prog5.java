package day4;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        getDuplicate(a);
    }
    public static void getDuplicate(int[] a){
        int max=a[0];
        int min=a[0];
        for(int x:a){
            if(x>max)
                max=x;
            else if (x<min) {
                min=x;
            }
        }
        int[] freq=new int[max-min+1];
        for(int i=0;i<a.length;i++){
            freq[a[i]-min]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1)
                System.out.println((i+min)+ " is "+freq[i]+" times");
        }
    }
}
