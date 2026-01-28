package day4;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();

        printLargestAndSmallest(n);
    }
    public static void printLargestAndSmallest(int a){
        int max=0;
        int min=9;
        while (a>0){
            int rem=a%10;
            if(rem>max)
                max=rem;
            else if(rem<min)
                min=rem;
            a/=10;
        }

        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum Number is : "+min);
    }
}
