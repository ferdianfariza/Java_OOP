package week_2;

public class Mahasiswa2 {
   public static void main(String[] args) {
      Mahasiswa mahasiswaTI = new Mahasiswa(); // create Objek
      mahasiswaTI.setData("A11.2020.15074", "Ferdian", "TI", 24);
      String angkatan = "";

      angkatan = mahasiswaTI.getNim().substring(4, 8);
      System.out.println("NIM: " + mahasiswaTI.getNim());
      System.out.println("NIM: " + mahasiswaTI.getNama());
      System.out.println("NIM: " + mahasiswaTI.getProgramStudi());
      System.out.println("NIM: " + mahasiswaTI.getUmur());
      System.out.println("Angkatan: " + mahasiswaTI.getNim().substring(4, 8));

      Mahasiswa mahasiswaSI = new Mahasiswa(); // create objek
      mahasiswaSI.setData("A12.2019.15074", "Faza", "SI", 28);

      System.out.println("NIM: " + mahasiswaSI.getNim());
      System.out.println("NIM: " + mahasiswaSI.getNama());
      System.out.println("NIM: " + mahasiswaSI.getProgramStudi());
      System.out.println("NIM: " + mahasiswaSI.getUmur());
      System.out.println("Angkatan: " + mahasiswaSI.getNim().substring(4, 8));
      // + String ketemu String artinya untuk menggabungkan tipe data
      // tetapi jika data berupa angka maka akan melakukan operasi penjumlahan
   }
}
