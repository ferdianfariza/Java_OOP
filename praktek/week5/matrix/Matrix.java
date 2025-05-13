import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    
    // Method untuk membaca matriks dari input
    // Menggunakan ArrayList<ArrayList<Integer>>
    public static ArrayList<ArrayList<Integer>> bacaMatrix(Scanner sc, int baris, int kolom, String namaMatriks) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        System.out.println("Masukkan elemen-elemen " + namaMatriks + ":");
        for (int i = 0; i < baris; i++) {
            ArrayList<Integer> dataBaris = new ArrayList<>();
            for (int j = 0; j < kolom; j++) {
                System.out.print("[" + i + "," + j + "] = ");
                int val = sc.nextInt();
                dataBaris.add(val);
            }
            matrix.add(dataBaris);
        }
        return matrix;
    }

    // Method untuk mencetak matriks
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix, String namaMatriks) {
        System.out.println("Matriks " + namaMatriks + ":");
        for (ArrayList<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Penjumlahan dua matriks (ukuran sama)
    public static ArrayList<ArrayList<Integer>> addMatrix(
            ArrayList<ArrayList<Integer>> A, 
            ArrayList<ArrayList<Integer>> B) {
        
        int baris = A.size();
        int kolom = A.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < baris; i++) {
            ArrayList<Integer> dataBaris = new ArrayList<>();
            for (int j = 0; j < kolom; j++) {
                int sum = A.get(i).get(j) + B.get(i).get(j);
                dataBaris.add(sum);
            }
            result.add(dataBaris);
        }
        return result;
    }

    // Pengurangan dua matriks (ukuran sama)
    public static ArrayList<ArrayList<Integer>> subtractMatrix(
            ArrayList<ArrayList<Integer>> A, 
            ArrayList<ArrayList<Integer>> B) {
        
        int baris = A.size();
        int kolom = A.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < baris; i++) {
            ArrayList<Integer> dataBaris = new ArrayList<>();
            for (int j = 0; j < kolom; j++) {
                int diff = A.get(i).get(j) - B.get(i).get(j);
                dataBaris.add(diff);
            }
            result.add(dataBaris);
        }
        return result;
    }

    // Pembagian dua matriks (element-wise)
    // Hati-hati jika ada elemen B bernilai 0
    public static ArrayList<ArrayList<Integer>> divideMatrix(
            ArrayList<ArrayList<Integer>> A, 
            ArrayList<ArrayList<Integer>> B) {
        
        int baris = A.size();
        int kolom = A.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < baris; i++) {
            ArrayList<Integer> dataBaris = new ArrayList<>();
            for (int j = 0; j < kolom; j++) {
                // Pastikan tidak membagi dengan nol
                if (B.get(i).get(j) == 0) {
                    System.out.println("Peringatan: Terdapat pembagian dengan 0! Hasil akan diset ke 0.");
                    dataBaris.add(0);
                } else {
                    int div = A.get(i).get(j) / B.get(i).get(j);
                    dataBaris.add(div);
                }
            }
            result.add(dataBaris);
        }
        return result;
    }

    // Perkalian dua matriks secara aljabar (A x B)
    // Ukuran A = (rA x cA), B = (rB x cB) dengan cA = rB
    public static ArrayList<ArrayList<Integer>> multiplyMatrix(
            ArrayList<ArrayList<Integer>> A, 
            ArrayList<ArrayList<Integer>> B) {
        
        int rA = A.size();
        int cA = A.get(0).size();
        int rB = B.size();
        int cB = B.get(0).size();
        
        // Hasil perkalian akan berukuran (rA x cB)
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Lakukan perkalian
        for (int i = 0; i < rA; i++) {
            ArrayList<Integer> dataBaris = new ArrayList<>();
            for (int j = 0; j < cB; j++) {
                int sum = 0;
                for (int k = 0; k < cA; k++) {
                    sum += A.get(i).get(k) * B.get(k).get(j);
                }
                dataBaris.add(sum);
            }
            result.add(dataBaris);
        }
        
        return result;
    }

    // Transpose matriks (ukuran r x c menjadi c x r)
    public static ArrayList<ArrayList<Integer>> transposeMatrix(ArrayList<ArrayList<Integer>> A) {
        int baris = A.size();
        int kolom = A.get(0).size();
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int j = 0; j < kolom; j++) {
            ArrayList<Integer> dataBaris = new ArrayList<>();
            for (int i = 0; i < baris; i++) {
                dataBaris.add(A.get(i).get(j));
            }
            result.add(dataBaris);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        
        System.out.println("===== Program Operasi Matriks dengan ArrayList =====");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Pengurangan Matriks");
            System.out.println("3. Perkalian Matriks (Aljabar)");
            System.out.println("4. Pembagian Matriks (element-wise)");
            System.out.println("5. Transpose Matriks");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi [1-6]: ");
            
            pilihan = sc.nextInt();
            
            if (pilihan == 6) {
                System.out.println("Terima kasih, program selesai.");
                break;
            }
            
            // Minta input ukuran matriks A
            System.out.print("Masukkan jumlah baris matriks A: ");
            int rA = sc.nextInt();
            System.out.print("Masukkan jumlah kolom matriks A: ");
            int cA = sc.nextInt();
            ArrayList<ArrayList<Integer>> A = bacaMatrix(sc, rA, cA, "Matriks A");
            
            // Jika hanya transpose, tidak perlu matriks B
            if (pilihan == 5) {
                // Transpose A
                ArrayList<ArrayList<Integer>> transA = transposeMatrix(A);
                printMatrix(A, "A (Asli)");
                printMatrix(transA, "A (Transpose)");
            } else {
                // Minta input ukuran matriks B
                System.out.print("Masukkan jumlah baris matriks B: ");
                int rB = sc.nextInt();
                System.out.print("Masukkan jumlah kolom matriks B: ");
                int cB = sc.nextInt();
                ArrayList<ArrayList<Integer>> B = bacaMatrix(sc, rB, cB, "Matriks B");
                
                switch (pilihan) {
                    case 1:
                        // Penjumlahan matriks: ukuran A harus sama dengan B
                        if (rA == rB && cA == cB) {
                            ArrayList<ArrayList<Integer>> sum = addMatrix(A, B);
                            printMatrix(A, "A");
                            printMatrix(B, "B");
                            printMatrix(sum, "A + B");
                        } else {
                            System.out.println("Penjumlahan gagal: ukuran matriks A dan B tidak sama.");
                        }
                        break;
                    
                    case 2:
                        // Pengurangan matriks: ukuran A harus sama dengan B
                        if (rA == rB && cA == cB) {
                            ArrayList<ArrayList<Integer>> diff = subtractMatrix(A, B);
                            printMatrix(A, "A");
                            printMatrix(B, "B");
                            printMatrix(diff, "A - B");
                        } else {
                            System.out.println("Pengurangan gagal: ukuran matriks A dan B tidak sama.");
                        }
                        break;
                    
                    case 3:
                        // Perkalian matriks: kolom A = baris B
                        if (cA == rB) {
                            ArrayList<ArrayList<Integer>> mul = multiplyMatrix(A, B);
                            printMatrix(A, "A");
                            printMatrix(B, "B");
                            printMatrix(mul, "A x B");
                        } else {
                            System.out.println("Perkalian gagal: kolom A != baris B.");
                        }
                        break;
                    
                    case 4:
                        // Pembagian matriks: ukuran A harus sama dengan B
                        if (rA == rB && cA == cB) {
                            ArrayList<ArrayList<Integer>> div = divideMatrix(A, B);
                            printMatrix(A, "A");
                            printMatrix(B, "B");
                            printMatrix(div, "A / B (element-wise)");
                        } else {
                            System.out.println("Pembagian gagal: ukuran matriks A dan B tidak sama.");
                        }
                        break;
                    
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            }
        }
        
        sc.close();
    }
}
