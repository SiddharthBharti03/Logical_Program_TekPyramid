import java.util.Scanner;

public class DivideString {
    public static void printString(String s,int n){
        if(!s.isEmpty()){
            int len=s.length();
            if(len%n != 0){
                System.out.println(" Not Divisible");
            }
            int len1=len/n;
            int size=0;
            for(int i=0;i<n;i++){
                System.out.println(s.substring(size,size+len1));
                size+=len1;
            }
        }
         else {
            System.out.println("String is null");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        System.out.println("Enter the divided Number");
        int n=sc.nextInt();
        printString(str,n);
    }
}
