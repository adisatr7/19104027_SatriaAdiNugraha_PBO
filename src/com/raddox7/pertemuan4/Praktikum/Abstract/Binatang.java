/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Praktikum.Abstract;

public abstract class Binatang {
    private String jenis;

    Binatang(String jenis) {
        this.jenis = jenis;
    }

    protected abstract void suara();

    public String toString() {
        return "Seekor " + jenis;
    }
}
