import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? "Palindrome" : "Not");
    }
}
