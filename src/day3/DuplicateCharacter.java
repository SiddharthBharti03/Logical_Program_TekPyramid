package day3;

import java.util.Scanner;

public class DuplicateCharacter {
    public static  void printDuplicate(String s){
        String st=s.toLowerCase();
        int dupCount=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if (s.indexOf(ch) != i) {
                continue;
            }
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(ch==st.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                dupCount++;
                System.out.println(ch +" -> "+count+" times");
            }

        }
        System.out.println("Duplicate characters in a String is : "+dupCount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        printDuplicate(s);
    }
}
