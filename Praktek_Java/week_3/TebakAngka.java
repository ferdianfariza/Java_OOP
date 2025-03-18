package week_3;

import java.util.Scanner;
import java.util.Random;

class TebakAngka {
   public static void main(String[] args) {
      Random r = new Random();
      Scanner s = new Scanner(System.in); // membuat objek
      System.out.print("Masukan angka: "); // membaca input pengguna Integer

      int angka = r.nextInt(50); // membaca input pengguna Integer
      // jika ingin membaca string pengguna gunakan reader.nextLine()
      int tebakan;

      // bisa mengecek dengean class lain sehingga code lebih modular

      do {
         tebakan = s.nextInt();
         if (angka > tebakan) {

            System.out.print("Salah, tebakan terlalu kecil: ");
         } else if (angka < tebakan) {

            System.out.print("Salah, tebakan terlalu Besar: ");
         } else if (angka == tebakan) {

            System.out.print("Benar, angkanya adalah: " + tebakan);
         }
      } while (angka != tebakan);
      // jika ingin membaca string pengguna gunakan nextLine()

      // mingdep buat lebih menantang
   }
}