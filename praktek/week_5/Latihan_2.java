package week_5;
import java.util.Scanner;

public class Latihan_2 {
   
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Input Bilangan: ");
      int input = scanner.nextInt();
      int kolom = 5;
      cetakAngka(kolom,input);
      
      System.out.print("Input Kolom: ");
      kolom = scanner.nextInt();
      cetakAngka(kolom,input);
     
      scanner.close();
   }
   
   public static void cetakAngka(int kolom, int input){
      int nilai = 1;
      int view = (input + kolom - 1) / kolom ;
      for (int i=0; i<view ; i++){
         for (int j=0; j<kolom ; j++){
            if (nilai <= input){

               System.out.print(nilai + " ");
               nilai++;
            }
            
         }
         System.out.println("");
      }
   }
}
