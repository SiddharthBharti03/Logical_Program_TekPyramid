package day4;

import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printThirdLargest(a);
    }
    public static void printThirdLargest(int[] arr){
        if (arr.length < 3) {
            System.out.println("Array must contain at least 3 elements");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != first && num != second) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("3rd largest element not found");
        } else {
            System.out.println("3rd largest element: " + third);
        }
    }
}
