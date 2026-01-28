package day4;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rotateLef(a);
    }
    public static void rotateLef(int[] arr){
        int n = arr.length;

        for (int r = 0; r < 2; r++) {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

