/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Praktikum.Object;

public class Mahasiswa {
    String nama;
    int NIM;

    //Constructor
    public Mahasiswa() {
    }

    public Mahasiswa(String nama, int NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    //Getter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }
}
