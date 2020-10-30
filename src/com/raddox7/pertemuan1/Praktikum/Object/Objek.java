/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Praktikum.Object;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        //Set value
        mahasiswaTanpa.setNama("Adi");
        mahasiswaTanpa.setNIM(19104027);

        //Output value
        System.out.println("Mahasiswa 1");
        System.out.println("Nama:\t" + mahasiswaTanpa.getNama());
        System.out.println("NIM:\t" + mahasiswaTanpa.getNIM());

        //Deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Someone", 19104099);

        //Output value (2)
        System.out.println("Mahasiswa 2");
        System.out.println("Nama:\t" + mahasiswa.getNama());
        System.out.println("NIM:\t" + mahasiswa.getNIM());
    }
}
