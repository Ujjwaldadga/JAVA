public class oddeven {
    public static void odd0rEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        odd0rEven(3);
        odd0rEven(11);
        odd0rEven(14);
    }
}
