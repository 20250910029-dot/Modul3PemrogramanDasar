/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3a;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class POST_TEST {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String mahasiswa[][];
        int jumlah;
        double totalNilaiAkhir = 0;

        System.out.println("DATA NILAI MAHASISWA\nSISTEM INFORMASI\nFKOM - UNIKU");
        System.out.print("Jumlah Orang : ");
        jumlah = Integer.parseInt(input.nextLine());

        // Kolom: [0] NIM, [1] NAMA, [2] TUGAS, [3] UTS, [4] UAS, [5] NILAI AKHIR
        mahasiswa = new String[jumlah][6];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.print("NAMA  : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.print("TUGAS : ");
            mahasiswa[i][2] = input.nextLine();
            System.out.print("UTS   : ");
            mahasiswa[i][3] = input.nextLine();
            System.out.print("UAS   : ");
            mahasiswa[i][4] = input.nextLine();

            double tugas = Double.parseDouble(mahasiswa[i][2]);
            double uts = Double.parseDouble(mahasiswa[i][3]);
            double uas = Double.parseDouble(mahasiswa[i][4]);

            // Rumus: (6 x Tugas + 2 x UTS + 2 x UAS) / 10
            double nilaiAkhir = (6 * tugas + 2 * uts + 2 * uas) / 10;

            mahasiswa[i][5] = String.format("%.2f", nilaiAkhir);
            totalNilaiAkhir += nilaiAkhir;
        }

        System.out.println();
        System.out.printf("%-4s%-14s%-18s%8s%8s%8s%12s%n",
                "NO", "NIM", "NAMA", "TUGAS", "UTS", "UAS", "NILAI AKHIR");
        System.out.println("-".repeat(72));

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d%-14s%-18s%8s%8s%8s%12s%n",
                    (i + 1),
                    mahasiswa[i][0],
                    mahasiswa[i][1],
                    mahasiswa[i][2],
                    mahasiswa[i][3],
                    mahasiswa[i][4],
                    mahasiswa[i][5]);
        }

        System.out.println("-".repeat(72));
        System.out.printf("Rata-rata nilai akhir : %.2f%n", totalNilaiAkhir / jumlah);

        input.close();
    }
}