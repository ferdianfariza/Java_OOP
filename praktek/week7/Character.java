package praktek.week7;
//inheritance adalah proses pewarisan sifat dari kelas induk ke kelas anak. yaitu dari superclass ke subclass,
// kelas itu hanya ada atribut dan method
// inheritance mewariskan method dan atribut dari superclass ke subclass
//hp, lvl, exp

public class Character { 
      protected String nama; //gunakan protected agar bisa diakses oleh subclass dan class itu sendiri
      protected int level = 0;
      protected int hp = 0;
      protected int exp = 0;

      public void Character(){
         this.nama= "Steve";
      }
      public void Character(String nama, int level, int hp, int exp){ //overloading constructor
         this.nama= nama;
         this.level= level;
         this.hp= hp;
         this.exp= exp;
      }
      public int getHp(){
         return this.hp;
      }
      public int getExp(){
         return this.exp;
      }
      public int getLevel(){
         return this.level;
      }
      public void setLevel(int level) {
         this.level = level;
      }
      public String getNama() {
         return nama;
      }
      
   }

   //buff merah biru
   //pilih senjata
   //pilih nama
   //pilih elf/knight/witch (agility/strenght/high damage low def)
   //
