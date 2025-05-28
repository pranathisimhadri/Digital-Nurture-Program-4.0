import java.util.Scanner;

public class ArrayCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Sum: " + sum + ", Avg: " + (double) sum / a.length);
    }
}
