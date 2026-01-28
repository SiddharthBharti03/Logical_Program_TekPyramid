package day4;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rotateRight(a);
    }
    public static void rotateRight(int[] arr){
        int n = arr.length;

        for (int r = 0; r < 2; r++) {
            int last = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
