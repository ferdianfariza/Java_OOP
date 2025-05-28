package tugas.week11;

import java.util.Scanner;

public class CellphoneMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cellphone cp = new Cellphone("Nokia", "3310");

        int pilihan;

        while (true) {
            System.out.println("\n=== MENU AWAL ===");
            System.out.println("1. Hidupkan HP");
            System.out.println("2. Keluar Program");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // clear newline

            switch (pilihan) {
                case 1:
                    cp.powerOn();
                    boolean hidup = true;

                    while (hidup) {
                        System.out.println("\n--- MENU HP ---");
                        System.out.println("1. Lihat Info HP");
                        System.out.println("2. Isi Pulsa");
                        System.out.println("3. Lihat Sisa Pulsa");
                        System.out.println("4. Tambah Kontak");
                        System.out.println("5. Lihat Semua Kontak");
                        System.out.println("6. Cari Kontak");
                        System.out.println("7. Delete Kontak");
                        System.out.println("8. Telpon");
                        System.out.println("9. Chat");
                        System.out.println("10. Matikan HP & Kembali ke Menu Awal");
                        System.out.print("Pilih menu: ");
                        int subMenu = input.nextInt();
                        input.nextLine();

                        switch (subMenu) {
                            case 1:
                                cp.phoneInfo();
                                break;
                            case 2:
                                System.out.print("Masukkan jumlah pulsa: ");
                                int pulsa = input.nextInt();
                                cp.topUpBalance(pulsa);
                                break;
                            case 3:
                                System.out.println("Sisa pulsa: " + cp.getBalance());
                                break;
                            case 4:
                                System.out.print("Nama kontak: ");
                                String nama = input.nextLine();
                                System.out.print("Nomor telepon: ");
                                String nomor = input.nextLine();
                                cp.insertContact(nama, nomor);
                                break;
                            case 5:
                                cp.listContact();
                                break;
                            case 6:
                                System.out.print("Nama yang dicari: ");
                                String cari = input.nextLine();
                                cp.getContact(cari);
                                break;
                            case 7:
                                System.out.print("Masukkan nama kontak yang ingin dihapus: ");
                                String hapusNama = input.nextLine();
                                cp.deleteContact(hapusNama);
                                break;
                            case 8:
                                try {
                                    cp.telpon();
                                } catch (PulsaTidakCukupException e) {
                                    System.out.println("Pulsa tidak cukup untuk menelpon. Kurang: " + e.getAmount());
                                }
                                break;

                            case 9:
                                try {
                                    cp.chat();
                                } catch (PulsaTidakCukupException e) {
                                    System.out.println("Pulsa tidak cukup untuk chat. Kurang: " + e.getAmount());
                                }
                                break;

                            case 10:
                                System.out.println("Mematikan HP...");
                                hidup = false;
                                break;

                            default:
                                System.out.println("Pilihan tidak valid!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Program selesai. Terima kasih.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
