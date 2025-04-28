package week_4;

public class Quiz {
   private String[] questions = {
         "Ibukota Indonesia adalah?",
         "Siapa driver F1 RedBull sekarang?",
         "Siapa yang Podium di F1 GP 2025?"
   };

   private String[][] options = {
         { "1. IKN", "2. Jakarta", "3. Merauke", "4. Bandung" },
         { "1. Max Verstappen", "2. Lewis Hamilton", "3. Sebastian Vettel", "4. Charles Leclerc" },
         { "1. Lando Norris", "2. Kimi Raikkonen", "3. Jann Maddenborough", "4. Leclerc" }

   };
   private int[] correctAnswers = { 2, 1, 1 };
   private int score = 0;
   public int getQuestionCount() {
      return questions.length;
   }

   public void displayQuestion(int index) {
      System.out.println("\nPertanyaan " + (index + 1) + ":" + questions[index]);
      for (int i = 0; i < options[index].length; i++) {
         System.out.println(options[index][i]);
      }
   }

   public void checkAnswer(int index, int userAnswer) {
      if (userAnswer == correctAnswers[index]) {
         score += 10;
      } else {
         System.out.println("Jawaban Anda Salah Yang Benar Adalah : " + options[index][correctAnswers[index] - 1]);
      }
   }

   public int getScore() {
      return score;
   }
}
