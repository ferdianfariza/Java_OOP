package week_5;

import java.util.Scanner;

public class Latihan_1 {
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Masukan Bilangan: ");
      int nilai = scanner.nextInt();

      cetakFaktorial(nilai);
      scanner.close();
   }
   public static void cetakFaktorial(int nilai){
         int hasil = 1;
         for( int j = 1 ; j <= nilai ; j++){
            System.out.print(hasil + " x "+ j +" = ");
            hasil *= j;
            System.out.print(hasil);
            System.out.println("");
         }
   };
}
