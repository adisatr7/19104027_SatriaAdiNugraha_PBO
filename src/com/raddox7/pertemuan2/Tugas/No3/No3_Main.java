/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Tugas.No3;

public class No3_Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("John","Jomblo",1);
        Mahasiswa mahasiswa2 = new Pacar("Fred","Berpacaran",3,"Jenn","Lama");

        mahasiswa1.getStatus();
        System.out.println();
        mahasiswa2.getStatus();
    }
}
