//package praktek_java.week_5.sorting;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        Random random = new Random();
        int[] angka = new int[10];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = random.nextInt(20);
        }

        System.out.println("Random Array:");
        printArray(angka);
        System.out.println("Sorting Array:");

        // Bubble Sorting
        boolean swaping = true;

        while (swaping) {
            swaping = false;
            for (int i = 0; i < angka.length - 1; i++) {
                if (angka[i] > angka[i + 1]) {
                    swaping = true;
                    int temp = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = temp;
                }
              }
              
              for (int i = 0; i < angka.length; i++) {
                System.out.print(" " + angka[i]);
              }
              System.out.println(" ");
              
            }

        System.out.println("Hasil Sorting:");
        printArray(angka);
    }

    private static void printArray(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            System.out.print(" " + angka[i]);
          }
          System.out.println(" ");
        }
}