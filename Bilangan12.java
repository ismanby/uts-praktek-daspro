import java.util.Scanner;

public class Bilangan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        double angka1, angka2, angka3;
        double terkecil, jumlahTerkecil;

        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan bilangan ketiga: ");
        angka3 = sc.nextDouble();

        // Mencari bilangan terkecil
        terkecil = angka1;
        if (angka2 < terkecil) {
            terkecil = angka2;
        }

        if (angka3 < terkecil) {
            terkecil = angka3;
        }
    
        // Menghitung jumlah bilangan terkecil
        jumlahTerkecil = 0;
        if (angka1 == terkecil) {
            jumlahTerkecil += 1;
        }
        if (angka2 == terkecil) {
            jumlahTerkecil += 1;
        }
        if (angka3 == terkecil) {
            jumlahTerkecil += 1;
        }

        // Menampilkan hasil
        System.out.println("Bilangan terkecil: " + terkecil);

        // Menampilkan jumlah bilangan terkecil & bilangannya apabila bilangan terkecil lebih dari 1
        if (jumlahTerkecil > 1) {
            System.out.println("Terdapat " + (int)jumlahTerkecil + " bilangan terkecil yang sama, yaitu " + terkecil);
        }

        sc.close();
    }
}
