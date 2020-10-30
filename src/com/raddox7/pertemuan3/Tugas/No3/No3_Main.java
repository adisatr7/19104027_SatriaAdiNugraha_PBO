/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No3;

import java.util.ArrayList;
import java.util.List;

public class No3_Main {
    public static void main(String[] args) {

        // Constructs a family object
        Keluarga keluarga = new Keluarga("Tobias", "Willow Creek");

        // Construct family members (components)
        Ayah ayah = new Ayah(1001, "Johnny", 45);
        Ibu ibu = new Ibu(2001, "Kinzie", 37);
        Anak anak1 = new Anak(3001, "Emily", 10, "Pelajar");
        Anak anak2 = new Anak(3002, "Evan", 8, "Pelajar");

        // Creates a temporary list to contain all the children
        List<Anak> anakList = new ArrayList<>();

        // Adds all the children into the temporary list
        anakList.add(anak1);
        anakList.add(anak2);

        // Adds all family members into family class object
        keluarga.addAnggotaKeluarga(ayah, ibu, anakList);

        // Prints out all family members' name
        keluarga.getDataKeluarga();
    }
}
