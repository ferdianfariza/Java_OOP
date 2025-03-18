package week_2;

public class Mahasiswa {
   // list of properties
   String nim;
   String nama;
   String programStudi;
   int umur;

   public void setData(String nim, String nama, String programStudi, int umur) {
      this.nim = nim;
      this.nama = nama;
      this.programStudi = programStudi;
      this.umur = umur;
   }

   public String getNim() {
      return this.nim;
   }

   public String getNama() {
      return this.nama;
   }

   public String getProgramStudi() {
      return this.programStudi;
   }

   public Integer getUmur() {
      return this.umur;
   }

}