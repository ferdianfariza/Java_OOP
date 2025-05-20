package latihan;

public class Exception {
   public static void main(String[] args){
      try{
         int saya = Integer.parseInt("asd");
      }  
      catch(NumberFormatException | NullPointerException nfe) {
         System.out.println("cannot parse int" + nfe.getMessage());
      }
   } 
}
