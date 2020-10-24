/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        // Constructs object 'jurusan' from class Jurusan
        Jurusan jurusan = new Jurusan("2110", "Software Engineering");

        // Construct some mahasiswa object from class Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Paimon", 21104001);
        Mahasiswa mahasiswa2 = new Mahasiswa("Tabi Bito", 21104002);
        Mahasiswa mahasiswa3 = new Mahasiswa("Barbara", 21104003);

        // Temporary array list
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(mahasiswa3);
        mahasiswaList.add(new Mahasiswa("Fischl", 21104004));

        // Adds this mahasiswaList above ^^ to the mahasiswaList inside 'jurusan' object
        jurusan.setMahasiswaList(mahasiswaList);

        // Prints out all data stored inside 'jurusan' object
        jurusan.printData();
    }
}
