package latihan;

public class Variable {
   // ❎ variable = a reusable container for a value
   // a reusable container for a value
   // 🟦 primitive = nilai yang langsung disimpan di memory (stack)
   // 🔴 reference = alamat memory (stack) yang mengrah ke (heap)
   //
   // 🔴 reference vs 🟦 primitive
   //    string           int
   //    object           double
   //    array            char
   //                     boolean

   public void main(String[] args){ //main method untuk di run
      int age = 10;
      int year = 2024;
      System.out.println("This year is "+ year +" and i "+ age +" years old");
      
      double price = 1.0;
      double gpa = 1.0;
      System.out.println(price + gpa);
      
      char and= '&';
      System.out.println(and);
      
      boolean isStudent = false; //camelcase
      boolean forSale = true;
      boolean isOnline = true;

      
      String name="ferdian nur fariza"; 

      if (isStudent){ // jika isStudent adalah true
         System.out.println("You Are Student");
      } else {
         System.out.println("You Are NOT Student");
      }
      
      System.out.println(isStudent);
      System.out.println("Helo my name is " + name);

      if(forSale){
         System.out.println("Aston Hall is for sale");
      } else {
         System.out.println("Aston Hall is NOT for sale");
         
      }
      
   }
}
