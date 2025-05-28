package test;

public class Modulo {
   public static void main(String[] args){
      isValidAmount(310000);
   }
   public static boolean isValidAmount(int amount) {
    for (int i = amount / 100_000; i >= 0; i--) {
      for (int j = (amount - i * 100_000) / 50_000; j >= 0; j--) {
         int sisa = amount - (i * 100_000 + j * 50_000);
         if (sisa >= 0 && sisa % 20_000 == 0) {
               System.out.println("100k: " + i + ", 50k: " + j + ", 20k: " + (sisa / 20_000));
               return true;
         }
      }
   }

    return false;
   }
}
