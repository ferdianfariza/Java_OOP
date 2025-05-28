package week_1.tugas_2;

public class Tugas2 {
   public static float phi = 22f / 7f;

   public static void main(String[] args) {

      // Persegi
      int sisi = 10;
      int luas = sisi * sisi;
      int keliling = 4 * sisi;
      System.out.println("Persegi--------------------");
      System.out.println("Sisi      : " + sisi + "cm");
      System.out.println("Luas      : " + luas + "cm^2");
      System.out.println("Keliling  : " + keliling + "cm");

      // Segitiga Sama Kaki
      int alas = 6;
      int tinggiSegitiga = 8;
      int sisiMiring = 10;
      int kelilingSegitiga = sisiMiring + sisiMiring + alas;
      int luasSegitiga = (alas * tinggiSegitiga) / 2;
      System.out.println("Segitiga Sama Kaki---------");
      System.out.println("Alas      : " + alas + "cm");
      System.out.println("Tinggi    : " + tinggiSegitiga + "cm");
      System.out.println("SisiMiring: " + sisiMiring + "cm");
      System.out.println("Luas      : " + luasSegitiga + "cm^2");
      System.out.println("Keliling  : " + kelilingSegitiga + "cm");

      // Lingkaran
      int dlingkaran = 10;
      float luasLingkaran = (1f / 4f) * phi * (dlingkaran * dlingkaran);
      float kelilingLingkaran = phi * dlingkaran;
      System.out.println("Lingkaran------------------");
      System.out.println("Diameter  : " + dlingkaran + "cm");
      System.out.println("Luas      : " + luasLingkaran + "cm^2");
      System.out.println("Keliling  : " + kelilingLingkaran + "cm");

      // Kubus
      int sKubus = 10;
      int kelilingKubus = 12 * sKubus;
      int luasPermukaanKubus = 6 * (sKubus * sKubus);
      int volumeKubus = sKubus * sKubus * sKubus;
      System.out.println("Kubus----------------------");
      System.out.println("Sisi            : " + sKubus + "cm");
      System.out.println("Volume          : " + volumeKubus + "cm^3");
      System.out.println("Keliling Kubus  : " + kelilingKubus + "cm");
      System.out.println("Luas Permukaan  : " + luasPermukaanKubus + "cm^2");
      System.out.println("---------------------------");

   }
}
