/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No1;

public class No1_Main {
    public static void main(String[] args) {

        // Komplek constructor
        Komplek komplek = new Komplek("0451", "Mekar Mulia");

        // Rumah constructors
        Rumah rumah1 = new Rumah("REG-001", "Kephin", 4);
        Rumah rumah2 = new Rumah("REG-002", "Sebastian", 2);
        Rumah rumah3 = new Rumah("VIP-001", "Sera", 3);
        Rumah rumah4 = new Rumah("VIP-002", "Yvona", 1);

        // Associate all 'rumah' objects with the one and only 'komplek' object
        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());
        komplek.addRumah(rumah4.getIdRumah());

        // A new household enters the suburb. Register it immediately!
        komplek.addRumah(new Rumah("REG-005", "Ivy", 2).getIdRumah());

        // Prints out the final house data
        komplek.getDataKomplek();
    }
}
