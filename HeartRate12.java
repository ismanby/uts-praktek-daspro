import java.util.Scanner;

public class HeartRate12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int umur, hr_latihan, mhr, persen_mhr;
        double persen_mhr_double;
        String kategori, saran;

        // Input umur
        System.out.print("Masukkan umur Anda: ");
        umur = sc.nextInt();

        // Input detak jantung saat latihan
        System.out.print("Masukkan detak jantung saat latihan (HR) Anda: ");
        hr_latihan = sc.nextInt();

        // Validasi input umur rentang 10-100 dan HR > 0 (bilangan positif)
        if (umur >= 10 && umur <= 100 && hr_latihan > 0) {
            // Rumus MHR dan persen MHR
            mhr = 220 - umur;
            persen_mhr_double = (double) hr_latihan / mhr * 100;
            persen_mhr = (int) Math.round(persen_mhr_double);

            // Menentukan kategori dan saran berdasarkan persen MHR
            if (persen_mhr < 50) {
                kategori = "Sangat ringan";
                saran = "Pemanasan, manfaat minimal.";
            } else if (persen_mhr >= 50 && persen_mhr < 60) {
                kategori = "Ringan";
                saran = "Peningkatan dasar kebugaran.";
            } else if (persen_mhr >= 60 && persen_mhr < 70) {
                kategori = "Sedang";
                saran = "Zona aerobik nyaman.";
            } else if (persen_mhr >= 70 && persen_mhr < 86) {
                kategori = "Kuat";
                saran = "Meningkatkan kapasitas kardiorespirasi.";
            } else {
                kategori = "Sangat berat";
                saran = "Berisiko bagi pemula, batasi durasi.";
            }

            // Menampilkan hasil
            System.out.println("Detak Jantuk Maksimal (MHR) Anda: " + mhr);
            System.out.println("Persentase MHR Anda: " + persen_mhr + "%");
            System.out.println("Kategori intensitas Anda: " + kategori);
            System.out.println("Saran: " + saran);
        }

        // Menampilkan pesan jika input tidak valid, kemudian program berakhir
        System.out.println("Angka yang Anda masukkan tidak valid.");

        sc.close();
    }
}
