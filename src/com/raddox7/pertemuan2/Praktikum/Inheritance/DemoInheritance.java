/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Praktikum.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Superclass:");
        superclass.x = 3;
        superclass.y = 4;
        superclass.printxy();

        System.out.println("Subclass:");
        subclass.x = 1;
        subclass.y = 2;
        subclass.printxy();

        subclass.z = 5;
        subclass.sumValue();
    }
}
