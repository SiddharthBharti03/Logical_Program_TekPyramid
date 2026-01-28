package day2;

import java.util.Scanner;

public class CaseConversion {
    public static void convertCase(String s){
        char[] ch=s.toCharArray();
        String result="";
        for(char c:ch){
            if(c >= 'a' && c<='z'){
                result=result+(char)(c-32);
            } else if (c >= 'A' && c<='Z') {
                result=result+(char)(c+32);
            }else{
                result=result+c;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        convertCase(s);
    }
}
