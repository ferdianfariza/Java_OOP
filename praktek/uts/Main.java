package praktek.uts;
import java.util.Scanner;
import praktek.uts.character.Character;
import praktek.uts.enemy.Enemy;

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean playAgain = true;
      while (playAgain) {
         int totalPotion = 3;
         Character main = new Character();
         Enemy anta = new Enemy();
         
         Welcome();
         System.out.print("Pilih karaktermu (1/2/3): ");
         int pilihChar = scan.nextInt();
         System.out.println("");
         
         switch(pilihChar) {
             case 1:
                 main.setCharElf();
                 anta.setCharElf();
                 break;
             case 2:  
                 main.setCharKnight();
                 anta.setCharKnight();
                 break;
             case 3: 
                 break;
             default:
                 System.out.println("Pilihan tidak valid. Karakter Default.");
                 break;
         }

         System.out.println("==== Karakter ====");
         System.out.println("Nama  : " + main.name);
         System.out.println("HP    : " + main.hp);
         System.out.println("Damage: " + main.damage);
         System.out.println("Shield: " + main.shield);
      
         System.out.println("====== Musuh =====");
         System.out.println("Nama  : " + anta.name);
         System.out.println("HP    : " + anta.hp);
         System.out.println("Damage: " + anta.damage);
         System.out.println("Shield: " + anta.shield);

         boolean gameRunning = true;
         while (gameRunning) {
            System.out.println("\nPilih Aksi Karakter");
            System.out.println("1. Serang");
            System.out.println("2. Bertahan");
            System.out.println("3. Minum Ramuan (Sisa: "+ totalPotion+" )");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            int action = scan.nextInt();

            switch(action) {
               case 1: 
                  main.attack(anta); 
                  anta.attack(main); 
                  System.out.println("HP pemain: " + main.hp + " | HP musuh: " + anta.hp);
                  System.out.println();
                  break;
                  
               case 2: 
                  main.defend(anta); 
                  anta.attack(main); 
                  main.attack(anta); 
                  anta.defend(main);
                  System.out.println("HP pemain: " + main.hp);
                  System.out.println("HP musuh: " + anta.hp);
                  break;

               case 3:
                  if (totalPotion == 0){
                     System.out.println("Potion Habis");
                     break;
                  } else {
                     main.drinkPotion();
                     totalPotion -= 1;
                  }
                  break;

               case 4: 
                  System.out.println("Keluar dari permainan.");
                  gameRunning = false;
                  break;

               default:
                  System.out.println("Pilihan tidak valid. Coba lagi.");
            }


            if (main.hp <= 0 && anta.hp <= 0) {
               System.out.println("Seri, keduanya mati ditempat");
               gameRunning = false;
            }
            else if (main.hp <= 0) {
               System.out.println(main.name + " kalah! Game Over.");
               System.out.println(main.name + " Mau restart game?");
               gameRunning = false;
            }
            else if (anta.hp <= 0) {
               System.out.println(anta.name + " kalah! Kamu menang!");
               System.out.println(anta.name + " Mau ngalahin musuh lagi?");
               gameRunning = false;
            }
         }
      System.out.println("1. Ya");
      System.out.println("2. Tidak");
      System.out.print("Pilih: ");
      int restartChoice = scan.nextInt();
      switch (restartChoice){
         case 1:
         playAgain = true;
         break;
         case 2:
         System.out.println("Terima kasih sudah bermain!");
         playAgain = false; 
         break;
         default:
         System.out.println("Invalid input, Terima kasih sudah bermain!");
         playAgain = false;
         break;
   }
}

      scan.close();
   }

   public static void Welcome(){
      Scanner scan = new Scanner(System.in);
      System.out.println(
      "\r\n" + //
      "  _                   _        __ _____  _                 \r\n" + //
      " | |                 | |      / _|  __ \\(_)                \r\n" + //
      " | |     ___  _ __ __| | ___ | |_| |__) |_ _ __   __ _ ___ \r\n" + //
      " | |    / _ \\| '__/ _` |/ _ \\|  _|  _  /| | '_ \\ / _` / __|\r\n" + //
      " | |___| (_) | | | (_| | (_) | | | | \\ \\| | | | | (_| \\__ \\\r\n" + //
      " |______\\___/|_|  \\__,_|\\___/|_| |_|  \\_\\_|_| |_|\\__, |___/\r\n" + //
      "                                                  __/ |    \r\n" + //
      "                                                 |___/     \r\n" + //
      "");
      System.out.println("Selamat datang di Lord of Rings");
      System.out.print("Tekan [enter] untuk melanjutkan --> ");
      scan.nextLine();
      System.out.println(" ");

      System.out.println("============================================");
      System.out.println("| No |  Karakter  |  HP  | Damage | Shield |");
      System.out.println("============================================");
      System.out.println("| 1. |    ELF     | 110  |  150   |   50   |");
      System.out.println("| 2. |   KNIGHT   | 150  |   50   |  100   |");
      System.out.println("| 3. |  DEFAULT   | 160  |  100   |   40   |");
      System.out.println("============================================");
   }
}
