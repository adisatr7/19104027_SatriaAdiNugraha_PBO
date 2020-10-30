/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Composition;

public class Mouse {

    // Attributes
    private String brand;
    private String dpi;

    // Constructor
    public Mouse(String brand, String dpi) {
        this.brand = brand;
        this.dpi = dpi;
    }

    // Prints out device's specs
    public void printSpec() {
        System.out.println("- Brand\t: " + brand);
        System.out.println("- DPI\t: " + dpi);
        System.out.println();
    }
}
