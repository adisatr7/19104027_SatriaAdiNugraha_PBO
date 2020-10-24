/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Praktikum.Polymorphism.Overload;

public class DemoOverload {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Badai Telah Berlalu");
        Lagu lagu2 = new Lagu("Halu","Feby");

        lagu1.getDataLagu();
        System.out.println();
        lagu2.getDataLagu();
    }
}
