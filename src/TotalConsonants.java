import java.util.Scanner;

public class TotalConsonants {
    public static int getTotalConsonants(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            String st=s.toLowerCase();
            char ch=st.charAt(i);
            if (ch >= 'a' && ch <= 'z' &&
                    ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        System.out.println(getTotalConsonants(str));
    }
}
