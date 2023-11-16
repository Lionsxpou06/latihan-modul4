package Latihan.Latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class KalkulatorAPI {

    public static void main(String[] args) throws IOException {
        // Inisialisasi variabel
        int pilihan;
        double a, b;

        // Tampilkan menu
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");

        // Membaca pilihan pengguna
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Pilih operasi (1/2/3/4/5): ");
        pilihan = Integer.parseInt(bufferedReader.readLine());

        // Melakukan operasi sesuai pilihan pengguna
        switch (pilihan) {
            case 1:
                // Akar Kuadrat
                System.out.print("Masukkan angka: ");
                a = Double.parseDouble(bufferedReader.readLine());
                System.out.println("Akar kuadrat dari " + a + " adalah " + Math.sqrt(a));
                break;
            case 2:
                // Pangkat
                System.out.print("Masukkan angka: ");
                a = Double.parseDouble(bufferedReader.readLine());
                System.out.print("Masukkan pangkat: ");
                b = Double.parseDouble(bufferedReader.readLine());
                System.out.println(a + " pangkat " + b + " adalah " + Math.pow(a, b));
                break;
            case 3:
                // Logaritma Natural
                System.out.print("Masukkan angka: ");
                a = Double.parseDouble(bufferedReader.readLine());
                System.out.println("Logaritma natural dari " + a + " adalah " + Math.log(a));
                break;
            case 4:
                // Faktorial
                System.out.print("Masukkan angka: ");
                int bilangan = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial(bilangan));
                break;
            case 5:
                // Keluar
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    // Fungsi faktorial
    public static long faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}

