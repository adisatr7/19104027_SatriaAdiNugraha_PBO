/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Association;

public class DemoKuliah {
    public static void main(String[] args) {

        // Constructs an empty 'mahasiswa1' object from Mahasiswa class
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // Assign value to Mahasiswa's attributes
        mahasiswa1.setNama("Paimon");
        mahasiswa1.setNIM(21104001);

        // Assigns attributes to a new 'mahasiswa2' object directly from constructor
        Mahasiswa mahasiswa2 = new Mahasiswa(21104002, "Tabi Bito");

        // Constructs 'dosen' object
        Dosen dosen = new Dosen();

        // Assign value to 'dosen' object
        dosen.setKodeDosen("ACW");
        dosen.setNimMHS(mahasiswa1.getNIM());
        dosen.setNimMHS(mahasiswa2.getNIM());

        // Prints out 'kodeDosen'
        System.out.println("Kode dosen: " + dosen.getKodeDosen());

        // Prints out the elements of 'jmlMahasiswa' array
        System.out.println("Mengajar mahasiswa: ");
        for (int i = 0; i < dosen.getJmlMahasiswa(); i++)
            System.out.println("- " + dosen.getNimMHS(i));
    }
}
