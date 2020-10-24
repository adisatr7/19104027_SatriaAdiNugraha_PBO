/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Aggregation;

public class Mahasiswa {
    private String nama;
    private int NIM;

    public Mahasiswa(String nama, int NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public int getNIM() {
        return NIM;
    }
}
