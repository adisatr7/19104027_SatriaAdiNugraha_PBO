/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Praktikum.Polymorphism.Override;

public class DemoOverride {
    public static void main(String[] args) {
        X superclass = new X();
        Y subclass = new Y();

        superclass.getValue("Tidur");
        subclass.getValue("Makan");
    }
}
