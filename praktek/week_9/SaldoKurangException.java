package praktek.week_9;

public class SaldoKurangException extends Exception {
   private double amount;
   public SaldoKurangException(double amount){
      this.amount = amount;
   }
   public double getAmount(){
      return amount;
   }
}
