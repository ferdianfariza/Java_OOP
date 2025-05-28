package praktek.week_9;
import java.util.*;

public class Bank {
   private ArrayList<Accounts> akunList = new ArrayList<>();
   private Scanner input = new Scanner(System.in);
   private Accounts akunAktif;
   public void mulai(){
      while(true){
         System.out.println("\n--- MENU UTAMA ---");
         System.out.println("1. Login");
         System.out.println("2. Buat Akun");
         System.out.println("3. Keluar");
         System.out.print("Pilihan: ");
         int pilihan = input.nextInt();
         
         switch (pilihan){

            case 1:
               login();
               break;
            case 2: 
               daftar();
               break;
            case 3: {
                System.out.println("Terima kasih!");
                return;
              }
            default : System.out.println("Invalid, pilih 1/2/3");
         }
      }
   }

   private void login(){
      System.out.print("Masukan nomor rekening (123): ");
      int noRek = input.nextInt();
      input.nextLine(); // clear newline

      System.out.print("Masukan password (parallel): ");
      String pass = input.nextLine().trim();

      for (Accounts akun : akunList){
         if (akun.getRekening() == noRek && akun.cekPassword(pass)){ //ex : 123 == 123 & true
            akunAktif = akun;
            System.out.println("Login Berhasil");
            menu();
            return;
         } else if(akun.getRekening() != noRek && akun.cekPassword(pass)) {
            System.out.println("Akun tidak ditemukan!");
         }
      }
   }
   private void daftar(){
      System.out.print("Masukan 3 digit angka (ex:123): ");
      int noRek= input.nextInt();
      input.nextLine(); // clear newline

       System.out.print("Masukan Password String: ");
      String pass = input.nextLine().trim();

      for(Accounts akun : akunList){ //cek list di akunList
         if (akun.getRekening() == noRek){
            System.out.println("Akun sudah ada, cari nama lain!");
            return;
         }
      }
      Accounts akunBaru = new Accounts(noRek, pass);
      akunList.add(akunBaru);
      System.out.println("Akun berhasil Dibuat! selamat datang " + noRek);
   }


   private void menu(){
      while(true){
         System.out.println("\n--- MENU NASABAH ---");
         System.out.println("Rekening: " + akunAktif.getRekening() + " | Saldo: " + akunAktif.getSaldo());
         System.out.println("1. Tarik");
         System.out.println("2. Tabung");
         System.out.println("3. Keluar dari " + akunAktif.getRekening());
         System.out.print("Pilihan: ");
         int pilihan = input.nextInt();
         
         switch (pilihan){
            case 1: 
               tarik();
               break;
            case 2:
               tabung();
               break;
            case 3:
               System.out.println("Terima kasih!");
               return;
            default:
               System.out.println("Invalid, pilih 1/2/3");
         }
      }
   }

  
   private void tabung(){
       try {
         input.nextLine();
         System.out.print("Nominal Tabung : ");
         String nominalInput = input.nextLine();
         double nominal = Double.parseDouble(nominalInput);
         akunAktif.tabung(nominal);
         System.out.println("Berhsail Tabung : "  + nominal + ", Saldo :" + akunAktif.getSaldo());
      }
      catch(Exception e){
         System.out.println("Input nilai integer atau desimal " + e.getMessage());
      }
   }
    private void tarik(){
      try {
         input.nextLine();
         System.out.print("Nominal Tarik : ");
         String nominalInput = input.nextLine();
         int nominal = Integer.parseInt(nominalInput);

         if (!isValidAmount(nominal)) {
            throw new TarikException("Nominal tidak bisa dicairkan dalam pecahan Rp100.000/Rp50.000/Rp20.000");
        }

         akunAktif.tarik(nominal);
         System.out.println("Berhsail Tarik : "  + nominal + ", Saldo sisa :" + akunAktif.getSaldo());
      }
      catch (TarikException e) {
        System.out.println("Gagal Tarik: " + e.getMessage());
    }
      catch(SaldoKurangException e){
         System.out.println("Saldo tidak mencukupi, kurang " + e.getAmount());
      }
      catch(Exception e){
         System.out.println("Input invalid " + e.getMessage());
      }
   }

   //tugas
   public static boolean isValidAmount(int amount) {
    for (int i = amount / 100_000; i >= 0; i--) {
      for (int j = (amount - i * 100_000) / 50_000; j >= 0; j--) {
         int sisa = amount - (i * 100_000 + j * 50_000);
         if (sisa >= 0 && sisa % 20_000 == 0) {
               System.out.println("Uang yang ditarik : 100k: " + i + ", 50k: " + j + ", 20k: " + (sisa / 20_000));
               return true;
         }
      }
   }

    return false;
   }
}