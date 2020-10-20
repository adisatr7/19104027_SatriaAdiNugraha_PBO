/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Tugas.No2;

public class No2_Main {
    public static void main(String[] args) {
        Burung burung = new Burung("Birdy");
        Ikan ikan = new Ikan("Fishy");
        Kucing kucing = new Kucing("Catty");

        burung.terbang();
        burung.makan(burung.getNama());
        burung.tidur(burung.getNama());

        System.out.println();

        ikan.berenang();
        ikan.makan(ikan.getNama());
        ikan.tidur(ikan.getNama());

        System.out.println();

        kucing.meow();
        kucing.makan(kucing.getNama());
        kucing.tidur(kucing.getNama());
    }
}
