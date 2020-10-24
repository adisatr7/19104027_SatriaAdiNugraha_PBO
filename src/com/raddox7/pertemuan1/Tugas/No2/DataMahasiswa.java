/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Tugas.No2;

public class DataMahasiswa {
    //Variables
    private String nama = "[Error]";
    private String kelas = "[Error]";
    private int NIM = 10000000;

    //Constructor #1
    public DataMahasiswa() {
    }

    //Constructor #2
    public DataMahasiswa(String nama, String kelas, int NIM) {
        this.nama = nama;
        this.kelas = kelas;
        this.NIM = NIM;
    }

    //Getter(s) & Setter(s)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }
}
