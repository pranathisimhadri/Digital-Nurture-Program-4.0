import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
