package week_2;

public class Character {
   String nama;
   int level;
   int hp = 0;
   int exp = 0;

   public void setData(String nama, int level, int hp) {
      this.nama = nama;
      this.level = level;
      this.hp = hp;
   }

   public void attack() {
      System.out.println(this.nama + " menyerang lawan");
   }

   public int getHp() {
      return this.hp;
   }

   public void attacked() {
      this.hp -= 1;
   }

   public void minumRamuan() {
      this.hp += 1;
   }

   public void levelUp() {
      this.hp += 1;
   }

   public void experiecne() {
      this.exp += 1;
   }

   public int getLevel() {
      return this.level;
   }

   public int getExp() {
      return this.exp;
   }
}
