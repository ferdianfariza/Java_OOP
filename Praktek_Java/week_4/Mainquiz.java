package week_4;

import java.util.Scanner;

public class Mainquiz {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Quiz quiz = new Quiz();

      System.out.println("Selamat Datang Di Kuis");
      System.out.println("Jawablah pertanyaan berikut ini");

      quiz.displayQuestion(1);
   }
}
