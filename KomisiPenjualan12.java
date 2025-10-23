import java.util.Scanner;

public class KomisiPenjualan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        double omzet, persen_komisi = 0, bonus_sertifikasi = 0, total_komisi, komisi_terima;
        int rating;
        String sertifikasi;

        // Input omzet penjualan
        System.out.print("Masukkan omzet penjualan Anda: ");
        omzet = sc.nextDouble();

        // Input rating kinerja
        System.out.print("Masukkan rating kinerja (1-100): ");
        rating = sc.nextInt();

        sc.nextLine(); // Membersihkan buffer

        // Input sertifikasi penjualan
        System.out.print("Apakah Anda memiliki sertifikasi penjualan (ya/tidak): ");
        sertifikasi = sc.nextLine();

        // Validasi input omzet > 0, rating 1-100, dan sertifikasi ya/tidak
        if (omzet > 0 && rating >= 1 && rating <= 100 && (sertifikasi.equalsIgnoreCase("ya") || sertifikasi.equalsIgnoreCase("tidak"))) {
            // Menentukan persentase komisi berdasarkan rating dan omzet
            if (rating >= 70) {
                if (omzet < 50000000) {
                    persen_komisi = 0.01;
                } else if (omzet >= 50000000 && omzet < 100000000) {
                    persen_komisi = 0.02;
                } else {
                    persen_komisi = 0.03;
                }
            } else if (rating >= 90) {
                persen_komisi += 0.01;
            } else {
                persen_komisi = 0.0;
            }

            // Jika memiliki sertifikasi dan rating >= 70, tambahkan bonus sertifikasi
            if (rating >= 70 && sertifikasi.equalsIgnoreCase("ya")) {
                bonus_sertifikasi = 500000;
            } 

            // Menghitung total komisi
            total_komisi = (omzet * persen_komisi) + bonus_sertifikasi;
            komisi_terima = omzet * persen_komisi;
            
            // Menampilkan hasil
            System.out.println("\n--- Rincian Komisi Penjualan ---");
            System.out.println("Persentase komisi: " + (persen_komisi * 100) + "%");
            System.out.println("Jumlah komisi Anda: Rp" + komisi_terima);
            System.out.println("Bonus sertifikasi: Rp " + bonus_sertifikasi);
            System.out.println("Jumlah komisi yang Anda terima: Rp " + total_komisi);
        }

        // Menampilkan pesan jika input tidak valid, kemudian program berakhir
        System.out.println("\nAngka yang Anda masukkan tidak valid.");

        sc.close();
    }
}