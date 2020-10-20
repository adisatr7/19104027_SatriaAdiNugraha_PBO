/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Praktikum.Class;

public class Kelas {
    private static String name = "Paiman";

    private static int setMinute() {
        int minute = 10;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t\t: " + name);
        System.out.println("Set Minute\t: " + setMinute());
    }
}
