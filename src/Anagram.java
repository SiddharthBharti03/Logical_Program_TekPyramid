import java.util.Arrays;

public class Anagram {
    public static  boolean isAnagram(String s,String s1){
        String st=s.toLowerCase();
        String st1=s1.toLowerCase();
        if(st.length()!=st1.length()){
            return false;
        }
        char [] ch=st.toCharArray();
        char[] ch1=st1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
    }
    public static void main(String[] args) {
        String s="listen";
        String s1="silent";
        System.out.println(isAnagram(s,s1));
    }

}
