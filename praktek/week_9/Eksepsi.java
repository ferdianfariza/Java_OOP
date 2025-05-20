package praktek.week_9;

public class Eksepsi {
   public static void main(String[] args){
      int arr[]= new int[10];
      arr[10] = 25;

      if(arr[10] == null){ // error 
         echo"tidak ditemukan";
      }

      int arr[]= new int[10];
      
      if(arr[10] == null){ // error 
         arr[10] = 25;
         echo"tidak ditemukan";
      }
      int arr[]= new int[10];
      
      if(arr[10] != null){ // error 
         arr[10] = 25;
         echo"tidak ditemukan";
      }

      try{
         //unexpected exeption
         //expected exeption
         //akan cek dulu dalam blok try, namun jika ternyata arr ke 10 tidak ada, maka yang ditangkap adalah arrayundexoutofboundsexeption e{ sout(terjadi ekseksi + e.message)}
         
      }
      catch{

      }
   }
}
