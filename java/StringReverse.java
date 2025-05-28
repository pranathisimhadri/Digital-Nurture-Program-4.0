import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(new StringBuilder(s).reverse());
    }
}
