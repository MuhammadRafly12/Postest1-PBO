/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Acer-GK
 */

public class Main {

    static class Film {
        String judul;
        String genre;
        int tahunRilis;
        double rating;
        String status; 

        Film(String judul, String genre, int tahunRilis, double rating, String status) {
            this.judul = judul;
            this.genre = genre;
            this.tahunRilis = tahunRilis;
            this.rating = rating;
            this.status = status;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Film> daftarFilm = new ArrayList<>();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n==============================");
            System.out.println("   Sistem Manajemen Film/Series");
            System.out.println("==============================");
            System.out.println("1. Tambah Film");
            System.out.println("2. Lihat Daftar Film");
            System.out.println("3. Update Film");
            System.out.println("4. Hapus Film");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Judul film/series: ");
                    String judul = input.nextLine();
                    System.out.print("Genre: ");
                    String genre = input.nextLine();
                    System.out.print("Tahun rilis: ");
                    int tahun = input.nextInt();
                    System.out.print("Rating (0-10): ");
                    double rating = input.nextDouble();
                    input.nextLine();
                    System.out.print("Status (Sedang Tayang/Selesai): ");
                    String status = input.nextLine();

                    daftarFilm.add(new Film(judul, genre, tahun, rating, status));
                    System.out.println("Film berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n --- Daftar Film/Series --- ");
                    if (daftarFilm.isEmpty()) {
                        System.out.println("Belum ada data film yang tersimpan.");
                    } else {
                        for (int i = 0; i < daftarFilm.size(); i++) {
                            Film film = daftarFilm.get(i);
                            System.out.println("[" + (i + 1) + "] "
                                    + film.judul + " (" + film.tahunRilis + ")"
                                    + "\n   Genre : " + film.genre
                                    + "\n   Rating: " + film.rating + "/10"
                                    + "\n   Status: " + film.status);
                            System.out.println("---------------------------------");
                        }
                    }
                    break;

                case 3:
                    if (daftarFilm.isEmpty()) {
                        System.out.println("Belum ada data film yang bisa diupdate.");
                        break;
                    }
                    System.out.println("\nPilih nomor film yang ingin diupdate:");
                    for (int i = 0; i < daftarFilm.size(); i++) {
                        Film film = daftarFilm.get(i);
                        System.out.println((i + 1) + ". " + film.judul + " (" + film.tahunRilis + ")");
                    }
                    System.out.print("Nomor film: ");
                    int indexUpdate = input.nextInt() - 1;
                    input.nextLine();

                    if (indexUpdate >= 0 && indexUpdate < daftarFilm.size()) {
                        System.out.print("Judul baru: ");
                        String judulBaru = input.nextLine();
                        System.out.print("Genre baru: ");
                        String genreBaru = input.nextLine();
                        System.out.print("Tahun rilis baru: ");
                        int tahunBaru = input.nextInt();
                        System.out.print("Rating baru (0-10): ");
                        double ratingBaru = input.nextDouble();
                        input.nextLine();
                        System.out.print("Status baru: ");
                        String statusBaru = input.nextLine();

                        daftarFilm.set(indexUpdate, new Film(judulBaru, genreBaru, tahunBaru, ratingBaru, statusBaru));
                        System.out.println(" Data film berhasil diupdate!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                    break;

                case 4:
                    if (daftarFilm.isEmpty()) {
                        System.out.println("Belum ada data film yang bisa dihapus.");
                        break;
                    }
                    System.out.println("\nPilih nomor film yang ingin dihapus:");
                    for (int i = 0; i < daftarFilm.size(); i++) {
                        Film film = daftarFilm.get(i);
                        System.out.println((i + 1) + ". " + film.judul + " (" + film.tahunRilis + ")");
                    }
                    System.out.print("Nomor film: ");
                    int indexHapus = input.nextInt();

                    if (indexHapus > 0 && indexHapus <= daftarFilm.size()) {
                        daftarFilm.remove(indexHapus - 1);
                        System.out.println("️Film berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                    break;

                case 5:
                    jalan = false;
                    System.out.println(" Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        input.close();
    }
}
