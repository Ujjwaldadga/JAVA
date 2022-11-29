import java.util.*;

public class substring {
    public static String subString(String str, int s, int e) {
        String substr = "";
        for(int i=s;i<e;i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));

        System.out.println(str.substring(0, 4));
    } 
}
