package latihan;

import java.util.Scanner;

public class UserInput {
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in); //objek bernamakan scanner
      // Scanner(System.in) adalah sebuah kelas yang dapat menerima input user dengan didalamnya terdapat parameter System.in

      System.out.print("Input nama anda: ");
      String name = scanner.nextLine(); //method scanner akan membaca string dengan spasi
      
      System.out.print("Input umur anda: ");
      int umur = scanner.nextInt(); //.next() tidak akan membaca string setelah spasi
      
      System.out.print("Input IPK anda: ");
      double ipk = scanner.nextDouble(); //.next() tidak akan membaca string setelah spasi
    
      System.out.print("Apakah anda seorang laki-laki? (true/false) ");
      boolean isMan = scanner.nextBoolean();

      
      System.out.println("Hello " + name);
      System.out.println("Now you are " + umur + " years old");
      System.out.println("And your GPA is " + ipk);
      
      if (isMan) {
         System.out.println("Kamu perlu sunat");
      } else {
         System.out.println("Kamu tidak perlu sunat");

      }

      scanner.close();
   }
}
