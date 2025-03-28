//package praktek_java.week_5.sorting;

import java.util.Arrays;
import java.util.Random;

public class Merge {
      public static void main(String[] args){

         // input random angka dan deklarasi array angka
         int[] angka = new int[10];
         Random random = new Random();
         for(int i = 0; i < angka.length ; i++){
            angka[i] = random.nextInt(50);
         }

         System.out.println(Arrays.toString(angka));
         mergeSort(angka);
      }

      public static void mergeSort(int[] angka){
         int panjang = angka.length;
         
         if (panjang < 2) {
            return;
         }

         int indexTengah = panjang /2;

         int[] kiri = new int[indexTengah];
         int[] kanan  = new int[panjang-indexTengah];
         
         // array kiri
         for (int i=0 ; i< indexTengah ;i++ ){
            kiri[i] = angka[i];
         }

         // array kanan atau setelah tengah
         for (int i=indexTengah ; i< panjang ;i++ ){
            kanan[i- indexTengah] = angka[i];
         }
         

         //rekursif class mergeSort
         mergeSort(kiri);
         mergeSort(kanan);

         merge(angka, kiri, kanan );
         System.out.print("Array: " +Arrays.toString(kiri) + Arrays.toString(kanan));
         System.out.println("--->" + Arrays.toString(angka));

      }
      public static void merge(int[] angka, int[] kiri,int[] kanan){
         int panjangKiri = kiri.length;
         int panjangKanan = kanan.length;
         int i = 0, j=0, k=0;
         while (i < panjangKiri && j < panjangKanan ){

            //proses penggabungan di array angka dengan,
            //1. kita bandingkan array index 0 di kiri dan kanan, jika di kiri lebih lebih kecil dari kanan, maka kiri ditaruh di array angka[0] dan sebaliknya
            if(kiri[i] <= kanan[j]){
               angka[k] = kiri[i];
               i++;
            }
            else {
               angka[k] = kanan[j];
               j++;
            }
            k++;
         }
         while(i<panjangKiri){
            angka[k]=kiri[i];
            i++;
            k++;
         }
         while(j<panjangKanan){
            angka[k]=kanan[j];
            j++;
            k++;
         }
      }
   }

