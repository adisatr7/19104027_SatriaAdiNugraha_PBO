/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Tugas.No1;

public abstract class Employee {
    String posisi;

    public Employee(String posisi) {
        this.posisi = posisi;
    }

    protected abstract long hitungGaji();

    public abstract void getData();
}
