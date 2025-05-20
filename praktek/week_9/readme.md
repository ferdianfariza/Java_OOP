exception adalah 

supaya program tetap jalan walaupun program ada kesalahan. mencegah program berhenti.

menggunakan kata kunci try, catch, finnaly, throw, throws.

1. Try Catch try-catch. dengan if tidak akan fleksibel, harus ada catch jika try
   
2. Multi catch, try-catch-catch-catch... misal input user dengan berbagai jenis, maka dapat di catch dengan inputan harus berupa bilangan bulat dan jika exeption maka dapat di catch lagi dengan method yang berbeda.
3. Finally adalah blok yang selalu dieksekusi tidak peduli terjadi exception atau tidak. berada setelah try dan atau multi catch. 
4. membuat exception sendiri, untuk menangani error yang kita buat. Throwable. import java.io.*; extends Exception merupakan kelas dari library java maybe.