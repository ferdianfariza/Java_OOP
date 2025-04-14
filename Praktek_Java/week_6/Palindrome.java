package praktek_java.week_6;
import java.util.Scanner;
// Kelas Main (program utama)
public class Palindrome {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("=== Palindrome ===");
      System.out.println("Masukkan kata: ");
      String input = scan.nextLine();
        TextGame game1 = new TextGame();
        TextGame game2 = new FancyTextGame();
        game1.displayResult(input);
        game2.displayResult(input);

        System.out.println();

    }
}