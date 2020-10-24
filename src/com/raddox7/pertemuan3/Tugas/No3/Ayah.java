/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No3;

public class Ayah {

    // Attributes
    private int idAyah;
    private String namaAyah;
    private int umurAyah;

    // Constructor
    public Ayah(int idAyah, String namaAyah, int umurAyah) {
        this.idAyah = idAyah;
        this.namaAyah = namaAyah;
        this.umurAyah = umurAyah;
    }

    // Returns the ID of the father
    public int getIdAyah() {
        return idAyah;
    }

    // Returns the name of the father
    public String getNamaAyah() {
        return namaAyah;
    }

    // Returns the age of the father
    public int getUmurAyah() {
        return umurAyah;
    }
}
