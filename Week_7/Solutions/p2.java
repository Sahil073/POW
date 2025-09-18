import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String answer = reverseWord(s);
        System.err.println(answer);
        in.close();
    }
    public static String reverseWord(String s){
        int start = 0;
        int end = s.length()-1;
        String ans = "";
        while(end >= 0){
            if(!isnumdigi(s.charAt(start))){
                start++;
                continue;
            }
            if(!isnumdigi(s.charAt(end))){
                end--;
                continue;
            }
            ans += s.charAt(end);
            
            end--;
            start++;
        }
        return ans;
    }
    public static boolean isnumdigi(char a){
        if( Character.isAlphabetic(a) || (Character.isDigit(a))){
            return true;
        }
        return false;
    }
}
