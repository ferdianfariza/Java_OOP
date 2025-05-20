package praktek.week_9;

public class Accounts {
   private int rekening;
   private double saldo;
   private String password;

   public Accounts(int rekening, String password){
      this.rekening = rekening;
      this.password = password;
      this.saldo = 0;
   }

   //getter
   public double getSaldo(){
      return saldo;
   }
   public int getRekening(){
      return rekening;
   }
   //cek input dengan password
   public boolean cekPassword(String input){
      return password.equals(input);
   }

   //method
   public void tabung(double jumlahTabung){
      saldo += jumlahTabung;
   }
   public void tarik(int jumlahTarik) throws SaldoKurangException{
         if(jumlahTarik <= saldo){
            saldo -= jumlahTarik;
         }
         else {
            double kebutuhan = jumlahTarik - saldo;
            throw new SaldoKurangException(kebutuhan);
         }
   }
}
