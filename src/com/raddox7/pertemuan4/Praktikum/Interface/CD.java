/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Praktikum.Interface;

public class CD {
    private String ukuran;
    private long hargaCD;

    public CD(String ukuran, long hargaCD) {
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }

    public long getHargaCD() {
        return hargaCD;
    }

    public void cetakCD() {
        System.out.println("Ukuran CD\t: " + ukuran);
        System.out.println("Harga CD\t: " + hargaCD);
        System.out.println();
    }
}
