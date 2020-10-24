/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Association;

public class Dosen {
    private String kodeDosen;
    private int[] nimMHS = new int[10];
    private int jmlMahasiswa = 0;

    public Dosen() {
    }

    public void setNimMHS(int NIM) {
        nimMHS[jmlMahasiswa] = NIM;
        jmlMahasiswa++;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public int getNimMHS(int index) {
        return nimMHS[index];
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }
}
