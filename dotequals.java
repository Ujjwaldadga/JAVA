import java.util.*;

public class dotequals {
    public static void main(String[] args) {
        String s1 = "Hey";
        String s2 = "Hey";
        String s3 = new String("Hey");

        if(s1 == s2) System.out.println("Strings are equal");
        else    System.out.println("Strings are not equal");

        if(s1.equals(s2)) System.out.println("Strings are equal");
        else    System.out.println("Strings are not equal");
    }
}