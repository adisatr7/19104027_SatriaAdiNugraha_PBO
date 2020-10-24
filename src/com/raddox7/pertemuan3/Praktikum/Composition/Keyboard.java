/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Composition;

public class Keyboard {

    // Attributes
    private String brand;
    private String type;

    // Constructor
    public Keyboard(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    // Prints out device's specs
    public void printSpec() {
        System.out.println("- Brand\t: " + brand);
        System.out.println("- Type\t: " + type);
        System.out.println();
    }
}
