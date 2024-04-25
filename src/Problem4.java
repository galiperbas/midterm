public class Problem4 {
    public static void main(String[] args) {
        System.out.println(divide(7, 2));
    }

    public static int divide(int dividend, int divisor) {
        if (dividend > divisor) {
            dividend -= divisor;
            return 1 + divide(dividend, divisor);
        }
        return 0;
    }
}
