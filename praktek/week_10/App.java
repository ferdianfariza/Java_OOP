package praktek.week_10;
import java.util.*;

public class App {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Mobil mobilku = new Mobil();
      Truk truku = new Truk();
      
      int jumlahRoda=input.nextInt();

      mobilku.setJumlahRoda(jumlahRoda);
      System.out.println(mobilku.getJumlahRoda());

      mobilku.nyalakan();
      truku.nyalakan();
   }
}
