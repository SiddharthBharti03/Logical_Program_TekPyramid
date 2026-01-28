package day3;

import java.io.*;
import java.util.Scanner;

public class MostRepeatedWordSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filePath = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line;

            // Read entire file into one string
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
            br.close();

            // Split into words
            String text = sb.toString().toLowerCase().trim();
            String[] words = text.split("\\s+");

            // Count frequencies manually
            int maxCount = 0;
            String mostRepeated = "";

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals("")) continue; // skip empty
                int count = 1;

                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = ""; // mark as visited
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    mostRepeated = words[i];
                }
            }

            System.out.println("Most repeated word: " + mostRepeated);
            System.out.println("Count: " + maxCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}