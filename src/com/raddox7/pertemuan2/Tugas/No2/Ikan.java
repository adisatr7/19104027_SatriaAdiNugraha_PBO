/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Tugas.No2;

public class Ikan extends Binatang {
    public String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void berenang() {
        System.out.println(nama + " mulai berenang!");
    }
}
