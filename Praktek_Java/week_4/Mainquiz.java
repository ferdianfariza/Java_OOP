package week_4;

import java.util.Scanner;

public class Mainquiz {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Quiz quiz = new Quiz();

      System.out.println("Selamat Datang Di Kuis");
      System.out.println("Jawablah pertanyaan berikut ini");

      for (int i = 0; i < quiz.getQuestionCount(); i++) {
         System.out.println("Pertanyaan ke-" + (i + 1));
         quiz.displayQuestion(i);
         System.out.print("Jawaban Anda : ");
         int answer = Integer.parseInt(scanner.nextLine());
         quiz.checkAnswer(i, answer);
      }

      System.out.println("Skor Anda: " + quiz.getScore());
      if (quiz.getScore() == 30) {
         System.out.println("Selamat Anda Mendapatkan Nilai Sempurna");
      } else {
         System.out.println("Anda Belum Mendapatkan Nilai Sempurna");
      }

   }
}
