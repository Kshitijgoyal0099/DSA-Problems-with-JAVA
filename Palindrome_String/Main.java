import java.util.Scanner;

public class Main {
    public static int calcLength(String str){
        int i = 0;
        char ch[]=str.toCharArray();
        for(char c : ch) {
            i++;
        }
        return i;
    }
    public static String checkPalindrome(String str,int StrLength){
        String temp = "";
        for(int i = StrLength-1 ; i >= 0 ; i--){
            temp = temp + str.charAt(i);
        }
        if (temp.equals(str)) return "YES";
        else {
            return "NO";
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int StrLength = calcLength(str);
        System.out.println("Length of the String : " +StrLength);
        String Ans;
        Ans = checkPalindrome(str,StrLength);
        System.out.println("The string is palindrome : " +Ans);
    }
}