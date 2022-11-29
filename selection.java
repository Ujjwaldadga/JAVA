import java.util.*;

public class Selection {
    public static void SS(int arr[]) {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos = j;
                }
            }
            int tem = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = tem;
        }
    }

    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        SS(arr);
        printarr(arr);
    }
}
