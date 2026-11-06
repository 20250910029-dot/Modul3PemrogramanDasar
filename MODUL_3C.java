/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3a;

/**
 *
 * @author ASUS
 */
public class MODUL_3C {
     public static void main(String args[]) {
        int duaD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                duaD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(duaD[i][j] + " ");
            }
            System.out.println();
        }
    }
}