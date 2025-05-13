package praktek.week8;

public class BangunDatar {
   protected int sisi;
   protected int panjang;
   protected int lebar;
   protected double tinggi;
   protected double alas;
   protected String stat;
   protected double radius;
   protected final double pi = 3.14;

   public BangunDatar(){
      this.stat="Starting";
   }

   public BangunDatar(int sisi){
      this.sisi = sisi;
      this.stat = "Persegi";
   }
   public BangunDatar(double radius){
      this.radius = radius;
      this.stat = "Lingkaran";
   }
   public BangunDatar(int panjang, int lebar){ //sama sama integer itu error
      this.panjang = panjang;
      this.lebar = lebar;
      this.stat = "PersegiPanjang";
   }
   public BangunDatar(double  alas, double tinggi){ // jadi harus berbeda tipe data
      this.alas = alas;
      this.tinggi = tinggi;
      this.stat = "Segitiga";
   }

   public double luasDouble(){
      double luas=0.0;
      if(this.stat.equals("Segitiga")){
          luas=this.alas*this.tinggi/2;
      }
      else if(this.stat.equals("Persegi")){
          luas= this.sisi*this.sisi;
      }
      else if(this.stat.equals("Lingkaran")){
          luas=pi*this.radius*this.radius;
      }
      else if(this.stat.equals("PersegiPanjang")){
          luas= this.panjang*this.lebar;
      }
      return luas;
   }

   public int luasInteger(){
      int luas=0;
      if(this.stat.equals("Persegi")){
          luas= this.sisi*this.sisi;
      }
      else if(this.stat.equals("PersegiPanjang")){
          luas= this.panjang*this.lebar;
      }
      else if(this.stat.equals("Segitiga")){
          luas= this.panjang*this.lebar;
      }
      return luas;
   }
}