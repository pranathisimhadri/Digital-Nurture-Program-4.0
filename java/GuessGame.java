
import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        int target = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            guess = sc.nextInt();
            System.out.println(guess < target ? "Too low" : guess > target ? "Too high" : "Correct!");
        } while (guess != target);
    }
}
