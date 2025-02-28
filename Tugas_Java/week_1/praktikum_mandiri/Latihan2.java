package week_1.praktikum_mandiri;

public class Latihan2 {
   public static float phi = 22f / 7f;

   public static void main(String[] args) {
      // Keliling Lingkaran
      int dlingkaran = 10;
      float kelilingLingkaran = phi * dlingkaran;
      System.out.println("Lingkaran");
      System.out.println("Phi       : " + phi);
      System.out.println("Diameter  : " + dlingkaran);
      System.out.println("Keliling(Phi*Diameter)  : " + kelilingLingkaran);
      System.out.println("\n");

      // Luas Segitiga
      int alas = 6;
      int tinggiSegitiga = 8;
      float luasSegitiga = (1f / 2f) * alas * tinggiSegitiga;
      System.out.println("Segitiga");
      System.out.println("Alas      : " + alas);
      System.out.println("Tinggi    : " + tinggiSegitiga);
      System.out.println("Luas(1/2*Alas*Tinggi)  : " + luasSegitiga);
      System.out.println("\n");

      // Volume Tabung
      int dTabung = 5;
      int tTabung = 10;
      float volumeTabung = (1f / 4f) * phi * dTabung * dTabung * tTabung;
      System.out.println("Tabung");
      System.out.println("Diameter  : " + dTabung);
      System.out.println("Tinggi    : " + tTabung);
      System.out.println("Volume(1/4*Phi*D2*Tinggi)  : " + volumeTabung);

   }
}
