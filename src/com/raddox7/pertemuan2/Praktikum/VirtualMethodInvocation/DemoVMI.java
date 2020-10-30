/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Praktikum.VirtualMethodInvocation;

public class DemoVMI {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parentChild = new Child();

        child.getData();
        parentChild.getData();
    }
}
