import java.util.Scanner;

public class TotalVowels {
    public static int getTotalVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            String st=s.toLowerCase();
            char c=st.charAt(i);
            if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        System.out.println(getTotalVowels(str));
    }
}
