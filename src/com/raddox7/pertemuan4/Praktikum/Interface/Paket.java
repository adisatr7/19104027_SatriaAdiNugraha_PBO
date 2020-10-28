/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Praktikum.Interface;

public class Paket extends Buku implements InterfaceCD {
    long hargaPaket;
    InterfaceCD interfaceCD;

    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) {
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
    }

    public void hitungHargaPaket() {
        hargaPaket = super.hargaBuku;
    }

    public long getHargaCD() {
        return interfaceCD.getHargaCD();
    }

    public void cetakCD() {
        interfaceCD.cetakCD();
    }

    public void cetakPaket() {
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket buku dan CD\t: Rp " + hargaPaket);
    }
}
