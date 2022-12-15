public class RecursionCount {
    public static void main(String[] args) {
        count(5);
        System.out.println(getPower(7,3));
    }

    public static void count(int n) {
        if(n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base,exponent - 1);
    }
}
