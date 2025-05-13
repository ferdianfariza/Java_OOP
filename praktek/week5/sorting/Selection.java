//package praktek_java.week_5.sorting;

import java.util.Arrays;
import java.util.Random;

public class Selection {
   public static void main(String[] args){

      int[] angka = new int[10];
      Random random = new Random();

      for(int i = 0; i < angka.length ; i++){
         angka[i] = random.nextInt(50);
      }

      System.out.println(Arrays.toString(angka));
      selectionSort(angka);
      
   }
   public static void selectionSort(int[] angka){
      int panjang = angka.length;
      for (int i= 0 ; i < panjang - 1 ; i++){
         int currentMin = angka[i];
         int indexMin = i; 
         for (int j = i +1; j< panjang; j++){
            if(angka[j] < min){
               currentMin = angka[j];
               indexMin = j;
            }
         }
         swap(angka, i, indexMin);
         System.out.println(Arrays.toString(angka));
      }
   }
   public static void swap(int[] angka, int a, int b){
         int temp = angka[a];
         angka[a]= angka[b];
         angka[b] = temp;
      }
   
}
