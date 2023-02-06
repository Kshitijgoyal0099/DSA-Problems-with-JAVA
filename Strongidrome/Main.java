import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String reverseStr = "";
        String reverseStr1 = "";
        String reverseStr2 = "";

        int strLength = str.length();
        int strLength1 = ((strLength - 1) / 2);
        int strLength2 = ((strLength + 3) / 2);

        String str1 = str.substring(0,(strLength1));
        String str2 = str.substring((strLength2 - 1) , (strLength));
        
        for (int i = (strLength - 1); i >= 0; --i)
        {
            reverseStr = reverseStr + str.charAt(i);
        }
        for (int i = (strLength1 - 1); i >= 0; --i)
        {
            reverseStr1 = reverseStr1 + str.charAt(i);
        }
        for (int i = (strLength - 1); i >= (strLength2 - 1); --i)
        {
            reverseStr2 = reverseStr2 + str.charAt(i);
        }

        if(str.equals(reverseStr) && str1.equals(reverseStr1) && str2.equals(reverseStr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}