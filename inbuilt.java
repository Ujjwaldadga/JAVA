import java.util.*;

public class inbuilt {
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printA(Integer arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {1,2,5,6,3};
        Integer A[] = {1,2,5,6,3};
        Arrays.sort(arr);
        printarr(arr);
        Arrays.sort(arr,2,4);
        printarr(arr);
        System.out.println();

        Arrays.sort(A, Collections.reverseOrder());
        printA(A);
        Arrays.sort(A,2,4, Collections.reverseOrder());
        printA(A);
    }
}
