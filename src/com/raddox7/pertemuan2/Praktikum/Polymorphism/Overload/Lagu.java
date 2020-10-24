/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Praktikum.Polymorphism.Overload;

public class Lagu {
    public String judul;
    public String pencipta;

    public Lagu(String judul) {
        this.judul = judul;
        this.pencipta = "Tidak diketahui";
    }

    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu() {
        System.out.println("Judul: " + judul + "\n"
                         + "Pencipta: " + pencipta);
    }
}
