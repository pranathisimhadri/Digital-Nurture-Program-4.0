public class Fibonacci {
    static int fib(int n) {
        return (n <= 1) ? n : fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
