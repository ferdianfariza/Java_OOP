# Week 1 - Introduction

## Praktek
```java
//code snippet
public class Hello { 
   public static void main(String[] args) { 
      System.out.print("Hello World");
   }
}
```
- Compile, type in terminal `javac src/<filename.java>`
- Run, type in terminal `java <classname>`

## Teori
Edit me

## Keynote
- Ketika kita menggunakan `public class` di dalam file, maka penamaan file dan penamaan `class` harus dengan huruf kapital karena java mengikuti aturan PascalCase[^1]. Jika tidak ada public class maka **penamaan file bebas**. [Baca Ini](https://www.freecodecamp.org/news/snake-case-vs-camel-case-vs-pascal-case-vs-kebab-case-whats-the-difference/) untuk mengerti perbedaan casing dalam penamaan suatu objek.
  
- Package[^2] bisa dibilang ini adalah 'folder' dalam project java, jika dalam bahasa singkatnya adalah
  `./university/student` = `package university.student;` - `package` berbeda dengan `import`. Perbedaan Package dan Import[^3].

- `main()` adalah kode titik awal kode java di eksekusi, sebuah file bisa tidak memiliki main, namun jika ingin menjalankannya perlu memanggil file tersebut di file lain yang memiliki `main()`. Lihat jenis-jenis Access Modifier disini [^4].

- `print` vs `println`[^5].

- static adalah keyword dalam Java yang mengikat variabel, method, atau class ke class itu sendiri, bukan ke objeknya. Bisa dipanggil tanpa membuat objek, Hanya ada satu salinan dalam memory (shared oleh semua objek), Tidak bisa mengakses non-static variabel/method langsung

- void sebuah fungsi yang tidak mengembalikan nilai atau return.




# Week 2 

### Footnote
[^1]: Every word starts with an uppercase letter 
[^2]: Package adalah cara untuk mengelompokkan class dan interface dalam folder yang terstruktur.
[^3]: Perbedaan Package dan Import

    | package      | import |
    | ----------- | ----------- |
    | Menentukan di mana file Java berada (seperti folder).   | Mengambil class dari package lain agar bisa digunakan. |   
    | tidak bisa mengimpor kelas   | mampu mengimpor kelas |   
    | 	`package university.student;`      | `import university.teacher.Teacher;`  |
    
[^4]: Jenis-jenis Access Modifier
    
    | Modifier       | Aksesibilitas | Example |
    | ----------- | ----------- | ------------|
    | `public` | Dari mana saja |   `public int data` |
    | `private` | Hanya dalam class itu sendiri |   `private int data` |
    | `protected` | Dalam class sendiri + subclass (inheritance) + package yang sama |   `protected int data;` |
    | default (tanpa modifier) | Dalam class sendiri + subclass (inheritance) + package yang sama |   `int data;` |

[^5]: print vs println

    | Method       | Baris Baru Setelah Cetak? | Output Berikutnya Muncul di? |
    | ----------- | ----------- | ------------|
    | `print()` | ❌ Tidak |   Baris yang sama |
    | `println()` | ✅ Ya |   Baris berikutnya |
    

    
