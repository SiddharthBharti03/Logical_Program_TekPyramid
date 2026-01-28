package day4;

import java.util.Scanner;

public class Prog15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to store in an array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter first Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] r=removeEven(a);
        for(int x:r){
            System.out.println(x);
        }
    }
    public static int[] removeEven(int [] a){
        int count = 0;
        for (int num : a) {
            if (num % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : a) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;

    }
}
