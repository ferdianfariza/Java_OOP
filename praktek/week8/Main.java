package praktek.week8;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){

      //condition
      boolean play=true;
      Scanner scan = new Scanner(System.in);
      

      while(play){
         System.out.println("\nPilih Bangun Ruang yang Akan Di Hitung");
         System.out.println("1. Persegi");
         System.out.println("2. Persegi Panjang");
         System.out.println("3. Segitiga ");
         System.out.println("4. Lingkaran");
         System.out.println("5. Keluar");
         System.out.print("Masukkan pilihan: ");
         int pilihan = scan.nextInt();
         int sisi;
         int lebar;
         int panjang;
         double alas;
         double tinggi;
         double radius;
         switch (pilihan){
            case 1:
            System.out.print("Memilih Persegi, masukan nilai sisi: ");
            sisi = scan.nextInt();
            BangunDatar Persegi = new BangunDatar(sisi);
            System.out.println(Persegi.luasInteger());
            break;
            case 2:
            System.out.println("Memilih Persegi Panjang");
            System.out.print("Masukan nilai lebar: ");
            lebar = scan.nextInt();
            System.out.print("Masukan nilai panjang: ");
            panjang = scan.nextInt();

            BangunDatar PersegiPanjang = new BangunDatar(panjang,lebar);
            System.out.println(PersegiPanjang.luasInteger());
            break;
            case 3:
            System.out.println("Memilih Segitiga");
            System.out.print("Masukan nilai lebar: ");
            alas = scan.nextInt();
            System.out.print("Masukan nilai panjang: ");
            tinggi = scan.nextInt();

            BangunDatar Segitiga = new BangunDatar(alas,tinggi);
            System.out.println(Segitiga.luasDouble());
            break;
            case 4:
            System.out.println("Memilih Lingkaran");
            System.out.print("Masukan nilai radius: ");
            radius = scan.nextInt();

            BangunDatar Lingkaran = new BangunDatar(radius);
            System.out.println(Lingkaran.luasDouble());
            break;
            case 5:
            play=false;
            break;
         }
      }

   }
}
