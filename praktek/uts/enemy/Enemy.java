package praktek.uts.enemy;

import praktek.uts.character.Character;

public class Enemy extends Character {

   public Enemy() {
      super("Gollum", 200, 60, 40);
   }

   @Override
   public void setCharKnight() {
      this.name = "Dark Knight";
      this.hp = 250;
      this.damage = 40;
      this.shield = 50;
   }

   @Override
   public void setCharElf() {
      this.name = "Dark Elf";
      this.hp = 170;
      this.damage = 90;
      this.shield = 40;
   }

   @Override
   public void attack(Character target) {
      int damageDeal = this.damage * (100 - target.shield) / 100;
      target.hp -= damageDeal;
      if (target.hp < 0) target.hp = 0;
      System.out.println(this.name + " menyerang " + target.name + ", Damage: " + damageDeal + " damage!");
   }

   
}