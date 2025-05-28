package praktek.week_10;

public abstract class Kendaraan {
   private String merk;
   private String model;
   private int jumlahRoda;

   
   
   public String setMerk(String merk){
      return merk;
   }
   public String setModel(String model){
      return model;
   }
   public void setJumlahRoda(int jumlahRoda){
      this.jumlahRoda = jumlahRoda;
   }
   public void getModel(){
      this.model = model;
   }
   public void getMerk(){
      this.merk = merk;
   }
   public int getJumlahRoda(){
      return jumlahRoda;
   }
   public abstract void nyalakan();
   
}
