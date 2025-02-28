package week_1.tugas_2;

public class Tugas2 {
   public static float phi = 22f / 7f;

   public static void main(String[] args) {

      // Persegi
      int sisi = 10;
      int luas = sisi * sisi;
      int keliling = 4 * sisi;
      System.out.println("Persegi");
      System.out.println("Sisi      : " + sisi);
      System.out.println("Luas      : " + luas);
      System.out.println("Keliling  : " + keliling);
      System.out.println("\n");

      // Segitiga Sama Kaki
      int alas = 6;
      int tinggiSegitiga = 8;
      int sisiMiring = 10;
      int kelilingSegitiga = sisiMiring + sisiMiring * alas;
      float luasSegitiga = (1f / 2f) * alas * tinggiSegitiga;
      System.out.println("Segitiga Sama Kaki");
      System.out.println("Alas      : " + alas);
      System.out.println("Tinggi    : " + tinggiSegitiga);
      System.out.println("SisiMiring: " + sisiMiring);
      System.out.println("Luas      : " + luasSegitiga);
      System.out.println("Keliling  : " + kelilingSegitiga);
      System.out.println("\n");

      // Lingkaran
      int dlingkaran = 10;
      float luasLingkaran = (1f / 4f) * phi * (dlingkaran * 2);
      float kelilingLingkaran = phi * dlingkaran;
      System.out.println("Lingkaran");
      System.out.println("Diameter  : " + dlingkaran);
      System.out.println("Luas      : " + luasLingkaran);
      System.out.println("Keliling  : " + kelilingLingkaran);
      System.out.println("\n");

      // Kubus
      int sKubus = 10;
      int kelilingKubus = 12 * sKubus;
      int luasPermukaanKubus = 6 * (sKubus * sKubus);
      int volumeKubus = sKubus * sKubus * sKubus;
      System.out.println("Kubus");
      System.out.println("Sisi            : " + sKubus);
      System.out.println("Volume          : " + volumeKubus);
      System.out.println("Keliling Kubus  : " + kelilingKubus);
      System.out.println("Luas Permukaan  : " + luasPermukaanKubus);

   }
}
