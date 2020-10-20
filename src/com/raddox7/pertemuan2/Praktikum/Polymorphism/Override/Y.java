/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Praktikum.Polymorphism.Override;

public class Y extends X {
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value class Y: " + value);
    }
}
