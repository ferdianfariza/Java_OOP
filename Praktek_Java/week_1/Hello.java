// Penamaan nama file diawali huruf kapital
// membuat package, membuat scope dari file yang kita buat/ class yang kita buat, nanti hubungannya dengan enkapsulasi
// (pertama kali dijalankan ) harus ada main jika ingin langsung di eksekusi
// 
package week_1; //jika kita di ./week_1 maka tidak usah menggunakan package, jika di ./papichulo maka menggunakan package
public class Hello{ //class ini public, bisa di akses dimana saja setelah huruf class harus Kapital
    public static void main(String[] args){ // method pertama yang akan dijalankan setiap kali class ini dijalankan dari parameternya Strings atau yang lain 

    //print = setelah string ditaruh dilayar maka tidak akan menambahkan enter di terminal
    //println = setelah string ditaruh dilayar maka akan menambahkan enter di terminal
    System.out.print("Hello World");
    }
}

//javac <source/source> (compile)
//java <source.source> (run/execute)