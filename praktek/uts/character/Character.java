package praktek.uts.character;
import java.util.Random;

public class Character {
   public String name;
   public int hp;
   public int damage;
   public int shield;

   public Character() {
      this("Steve Craft", 160, 100, 40); // Default karakter
   }

   public Character(String name, int hp, int damage, int shield) {
      this.name = name;
      this.hp = hp;
      this.damage = damage;
      this.shield = shield;
   }

   public void setCharKnight() {
      this.name = "Julius Caesar";
      this.hp = 200;
      this.damage = 50;
      this.shield = 50;
   }

   public void setCharElf() {
      this.name = "Thranduil Opherion";
      this.hp = 110;
      this.damage = 150;
      this.shield = 50;
   }

   public void attack(Character target) {
      Random rand = new Random();
      int baseShield = this.shield;
      int baseDamage = this.damage;
      
      int randomDamagePercentage = 100 + rand.nextInt(20); 
      int randomShieldPercentage = 80 + rand.nextInt(10);
      
      this.damage = this.damage * randomDamagePercentage / 100;
      this.shield = this.shield * randomShieldPercentage / 100;

      int damageDeal = this.damage * (100 - target.shield) / 100; 
      target.hp -= damageDeal;
      if (target.hp < 0) target.hp = 0;

      System.out.println(this.name + " menyerang " + target.name + ", Damage: " + damageDeal + " damage!");
      
      this.shield = baseShield;
      this.damage = baseDamage;
   }
   
      private void defend(Character target) {
      Random rand = new Random();
      int baseDamage=this.damage;
      int baseShield=this.shield;
      
      int randomShieldPercentage = 100 + rand.nextInt(21); //0-20
      int randomDamagePercentage = 80 + rand.nextInt(11);  //0-10
      
      this.damage = this.damage * randomDamagePercentage / 100;
      this.shield = this.shield * randomShieldPercentage / 100;
      
      System.out.println(this.name + " bertahan! Shield bertambah (Shield: " + this.shield +")");
      
      this.shield = baseShield;
      this.damage = baseDamage;
   }


   public void drinkPotion() {
      int heal = 15;
      this.hp += heal;
      System.out.println(this.name + " minum ramuan dan memulihkan " + heal + " HP! Sekarang HP: " + this.hp);
   }

}
