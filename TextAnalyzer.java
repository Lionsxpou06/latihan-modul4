package Latihan.Latihan2;

import java.util.Scanner;

public class TextAnalyzer {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    inputText(scanner);
                    break;
                case 2:
                    // Gunakan API isEmpty() untuk memeriksa apakah teks kosong
                    if (!text.isEmpty()) {
                        countCharacters();
                    } else {
                        System.out.println("Teks masih kosong. Silakan masukkan teks terlebih dahulu.\n");
                    }
                    break;
                case 3:
                    // Gunakan API isEmpty() untuk memeriksa apakah teks kosong
                    if (!text.isEmpty()) {
                        countWords();
                    } else {
                        System.out.println("Teks masih kosong. Silakan masukkan teks terlebih dahulu.\n");
                    }
                    break;
                case 4:
                    // Gunakan API isEmpty() untuk memeriksa apakah teks kosong
                    if (!text.isEmpty()) {
                        searchWord(scanner);
                    } else {
                        System.out.println("Teks masih kosong. Silakan masukkan teks terlebih dahulu.\n");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void inputText(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        text = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!\n");
    }

    private static void countCharacters() {
        // Gunakan API length() untuk menghitung jumlah karakter dalam teks
        int characterCount = text.length();
        System.out.println("Jumlah karakter dalam teks: " + characterCount + "\n");
    }

    private static void countWords() {
        // Gunakan API split() untuk membagi teks menjadi kata-kata
        String[] words = text.split("\\s+");
        // Gunakan API length() untuk menghitung jumlah kata dalam teks
        int wordCount = words.length;
        System.out.println("Jumlah kata dalam teks: " + wordCount + "\n");
    }

    private static void searchWord(Scanner scanner) {
        System.out.println("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();

        // Gunakan API equalsIgnoreCase() untuk membandingkan kata yang dicari dengan kata-kata dalam teks dengan mengabaikan perbedaan huruf besar dan kecil
        int count = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }

        System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + count + " kali dalam teks.\n");
    }
}