/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan5.Tugas;

import static com.raddox7.pertemuan5.Tugas.StaticMethods.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("<--- Pelanggan --->");

        // Input length array
        int jml = getInt("Jumlah pengunjung: ");

        // Deklarasi array
        int[] pengunjung = new int[jml];

        // Mengisi array
        System.out.println("Masukan Data Pengunjung!");
        fillUID(pengunjung);

        // Mode lihat isi array
        boolean isDone = false;
        while (!isDone) {
            int index = getInt("\nLihat data pengunjung: ");
            getValue(pengunjung, index);

            isDone = confirmExit();
        }
        System.out.println("Menutup program...");
    }
}
