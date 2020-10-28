/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Tugas.No1;

public class CommissionEmployee extends Employee {
    String nama, nip;
    long gajiPokok, komisi, totalPenjualan;

    public CommissionEmployee(String nama, String nip, long gajiPokok, long komisi, long totalPenjualan) {
        super("Commission Employee");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    public long hitungGaji() {
        return gajiPokok + (komisi * totalPenjualan);
    }

    public void getData() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIP\t\t: " + nip);
        System.out.println("Jabatan\t: " + super.posisi);
        System.out.println("Gaji\t: Rp " + hitungGaji());
    }
}
