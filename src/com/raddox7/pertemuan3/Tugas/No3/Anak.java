/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No3;

public class Anak {

    // Attributes
    private int idAnak;
    private String namaAnak;
    private int umurAnak;
    private String statusAnak;

    // Constructor
    public Anak(int idAnak, String namaAnak, int umurAnak, String statusAnak) {
        this.idAnak = idAnak;
        this.namaAnak = namaAnak;
        this.umurAnak = umurAnak;
        this.statusAnak = statusAnak;
    }

    // Returns the ID of the child
    public int getIdAnak() {
        return idAnak;
    }

    // Returns the name of the child
    public String getNamaAnak() {
        return namaAnak;
    }

    // Returns the age of the child
    public int getUmurAnak() {
        return umurAnak;
    }

    // Returns the status of the child
    public String getStatusAnak() {
        return statusAnak;
    }
}
