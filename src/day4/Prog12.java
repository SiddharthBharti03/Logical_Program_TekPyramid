package day4;

import java.util.Scanner;

public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (range 1 to n): ");
        int n = sc.nextInt();
        int[] arr = new int[n ];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = findMissing(arr, n);
        System.out.println("Missing number is: " + missing);
    }

    public static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return  actualSum-expectedSum;
    }
}
