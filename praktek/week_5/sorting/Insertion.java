//package praktek_java.week_5.sorting;
import java.util.Arrays;
import java.util.Random;

public class Insertion {
    public static void main(String[] args) {
        // Input random angka
        int[] angka = new int[10];
        Random random = new Random();
        for (int i = 0; i < angka.length; i++) {
            angka[i] = random.nextInt(50);
        }

        System.out.println("Before:");
        System.out.println(Arrays.toString(angka));

        // Proses sorting dengan menampilkan setiap perubahan
        insertionSort(angka);

        System.out.println("\nAfter:");
        System.out.println(Arrays.toString(angka));
    }

    private static void insertionSort(int[] angka) {
        System.out.println("\nProses Insertion Sort:");
        for (int i = 1; i < angka.length; i++) {
            int nilaiCurrent = angka[i];
            int j = i - 1;

            System.out.println("\nIterasi ke-" + i + ":");
            System.out.println("Menyisipkan " + nilaiCurrent + " ke posisi yang tepat");

            while (j >= 0 && angka[j] > nilaiCurrent) {
                angka[j + 1] = angka[j]; // Geser elemen ke kanan
                j--;
                System.out.println(Arrays.toString(angka)); // Tampilkan array setelah pergeseran
            }
            angka[j + 1] = nilaiCurrent; // Tempatkan nilaiCurrent di posisi yang benar
            System.out.println("Array setelah penyisipan:");
            System.out.println(Arrays.toString(angka));
        }
    }
}