/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket a = new Paket(
                "PBO",
                "Bagus",
                90000,
                "600 Mb",
                85000);

        a.hitungHargaPaket();
        a.cetakPaket();
    }
}
