/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Tugas.No2;

public class Burung extends Binatang {
    public String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void terbang() {
        System.out.println(nama + " mulai lepas landas!");
    }
}
