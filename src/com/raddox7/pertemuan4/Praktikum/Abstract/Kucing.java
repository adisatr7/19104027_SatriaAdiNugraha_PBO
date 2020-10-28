/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Praktikum.Abstract;

public class Kucing extends Binatang {
    private String nama;

    Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }

    public void suara() {
        System.out.println("Mengeong");
    }

    public String toString() {
        return super.toString() + " " + nama;
    }
}
