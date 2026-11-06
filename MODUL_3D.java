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
public class MODUL_3D {
     public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String mahasiswa[][];
        int jumlah;
        System.out.println("DATA NILAI MAHASISWA\nSISTEM INFORMASI\nFKOM - UNIKU");
        System.out.print("Jumlah Orang : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][6];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke -" + i + 1);
            System.out.print("NIM : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.print("NAMA : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.print("NILAI : ");
            mahasiswa[i][2] = input.nextLine();
        }
        System.out.print("\nNo.\tNIM\tNAMA\tNILAI\n");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + mahasiswa[i][0] + 
"\t" + mahasiswa[i][1] + "\t" + mahasiswa[i][2] + "\t");
        }
    }
}
