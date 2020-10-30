/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Praktikum.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of object
        Manusia[] arrayManusia = new Manusia[3];

        //Constructor #1
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Jean");
        manusia1.setUmur(20);

        //Constructor #2
        Manusia manusia2 = new Manusia("Fischl");

        //Constructor #3
        Manusia manusia3 = new Manusia("Barbara", 18);

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia) {
            System.out.println("Character");
            System.out.println("Nama:\t" + x.getNama());
            System.out.println("Umur:\t" + x.getUmur());
            System.out.println();
        }
    }
}
