/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3a;

/**
 *
 * @author ASUS
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TUGAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Format angka dengan pemisah ribuan ala Indonesia (10.000.000)
        NumberFormat format = NumberFormat.getInstance(Locale.of("id", "ID"));

        final int MAKS = 5; // jumlah maksimal karyawan

        // Array dua dimensi dengan kapasitas maksimal 5 karyawan
        // Kolom: [0] = nama, [1] = jabatan, [2] = gapok, [3] = tunjangan
        String[][] karyawan = new String[MAKS][4];

        System.out.println("DATA GAJI KARYAWAN (maksimal " + MAKS + " karyawan)");

        int jumlah;
        do {
            System.out.print("Jumlah Karyawan : ");
            jumlah = Integer.parseInt(input.nextLine());
            if (jumlah < 1 || jumlah > MAKS) {
                System.out.println("Jumlah harus antara 1 sampai " + MAKS + "!");
            }
        } while (jumlah < 1 || jumlah > MAKS);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Karyawan ke-" + (i + 1));
            System.out.print("Nama      : ");
            karyawan[i][0] = input.nextLine().toUpperCase();
            System.out.print("Jabatan   : ");
            karyawan[i][1] = input.nextLine().toUpperCase();
            System.out.print("Gapok     : ");
            karyawan[i][2] = input.nextLine();
            System.out.print("Tunjangan : ");
            karyawan[i][3] = input.nextLine();
        }

        // Tampilkan tabel
        System.out.println();
        System.out.printf("%-5s%-15s%-15s%15s%15s%n",
                "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");
        System.out.println("-".repeat(65));

        for (int i = 0; i < jumlah; i++) {
            long gapok = Long.parseLong(karyawan[i][2]);
            long tunjangan = Long.parseLong(karyawan[i][3]);

            System.out.printf("%-5d%-15s%-15s%15s%15s%n",
                    (i + 1),
                    karyawan[i][0],
                    karyawan[i][1],
                    format.format(gapok),
                    format.format(tunjangan));
        }

        input.close();
    }
}