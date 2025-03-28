//package praktek_java.week_5.sorting;

import java.util.Arrays;
import java.util.Random;

public class Insertion{
  public static void main(String[] args){

      // input random angka dan deklarasi array angka
      int[] angka = new int[10];
      Random random = new Random();
      for(int i = 0; i < angka.length ; i++){
         angka[i] = random.nextInt(50);
      }

      //before
      System.out.println(Arrays.toString(angka));
      insertionSort(angka);
      cetakHasil(angka);

      //after sorting
      System.out.println(Arrays.toString(angka));
  } 
  private static void insertionSort(int[] angka) {
      for (int i = 1; i < angka.length; i++) {
      
         int nilaiCurrent  = angka[i];
         
         int j = i - 1;
         while (j >= 0 && angka[j] > nilaiCurrent ) {
            angka[j + 1] = angka[j];
            j--;
         }
         angka[j + 1] = nilaiCurrent ;
      }
   }
   private static void cetakHasil(int[] angka) {
      for (int i = 0; i < angka.length; i++) {
         System.out.println(angka[i]);
      }
   }
}