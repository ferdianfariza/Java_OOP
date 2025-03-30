//package week_5.array;

import java.util.Scanner;

public class Latihan_2 {
   public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);

      System.out.print("Total siswa: ");
      int totalSiswa = scanner.nextInt();

      System.out.print("Total daftar nilai: ");
      int totalMatkul = scanner.nextInt();

      int[][] array = new int[totalSiswa][totalMatkul];

      for (int i = 0 ; i < totalSiswa ; i++){
         for (int j= 0 ; j < totalMatkul ; j++){
            System.out.print("Siswa ke-" + (i+1) +", ");
            System.out.print("Masukkan nilai ke-" + (j+1) +": ");
            array [i][j] = scanner.nextInt();
         }
      }
      
      
      System.out.println("----------hasil nilai----------");
      daftarNilai(totalSiswa,totalMatkul, array);
      scanner.close();
   }
   public static void daftarNilai(int totalSiswa, int totalMatkul, int[][] array){
      for (int i = 0 ; i < totalSiswa ; i++){
         System.out.println("Siswa ke-" + (i+1));
         for (int j= 0 ; j < totalMatkul ; j++){
            System.out.println("|--->Nilai ke-" + (j+1) +": " + array[i][j]);
         }
         System.out.println("");
      }
   };
}
