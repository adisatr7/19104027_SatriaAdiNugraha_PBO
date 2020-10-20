/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Tugas.No3;

public class Mahasiswa {
    public String nama;
    public String status;
    public int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);
    }
}
