/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Tugas.No2;

import java.util.Scanner;

public class No2_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataMahasiswa profile;

        System.out.println("Page Registrasi Mahasiswa");
        System.out.println();

        System.out.print("Masukan nama lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukan kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukan NIM: ");
        String NIM = input.nextLine();

        int nim;
        if (NIM.isEmpty())
            nim = 0;
        else
            nim = Integer.parseInt(NIM);

        if (!nama.equals("") && !kelas.equals("") && nim >= 10000000 && nim <= 99999999)
            profile = new DataMahasiswa(nama, kelas, nim);
        else
            profile = new DataMahasiswa();

        System.out.println("Data Anda telah berhasil diregistrasikan ke database!");
        System.out.println();

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu Utama");
            System.out.println();
            System.out.println("1) Tampilkan biodata");
            System.out.println("2) Perbaiki nama lengkap");
            System.out.println("3) Ganti kelas");
            System.out.println("4) Ubah NIM");
            System.out.println("x) Keluar");
            System.out.println();
            System.out.print("> ");

            char nav = input.next().charAt(0);
            System.out.println();

            switch (nav) {
                case '1':
                    System.out.println("Nama lengkap: " + profile.getNama());
                    System.out.println("Kelas: " + profile.getKelas());
                    System.out.println("NIM: " + profile.getNIM());
                    break;

                case '2':
                    System.out.println("Nama sebelum diperbaiki: " + profile.getNIM());
                    System.out.print("Masukan perbaikan nama: ");
                    String nameFix = input.nextLine();
                    profile.setNama(nameFix);
                    System.out.println("Nama mahasiswa berhasil diperbaiki!");
                    break;

                case '3':
                    System.out.println("Kelas sekarang: " + profile.getClass());
                    System.out.print("Masukan kelas baru: ");
                    String classFix = input.nextLine();
                    profile.setKelas(classFix);
                    System.out.println("Kelas berhasil diganti!");

                case '4':
                    System.out.println("NIM Anda: " + profile.getNIM());
                    System.out.print("Masukan NIM Anda: ");
                    int newNIM = input.nextInt();
                    profile.setNIM(newNIM);
                    System.out.println("NIM berhasil diubah!");

                case 'x':
                    System.out.println("Anda yakin ingin keluar? (Y/N)");
                    nav = input.nextLine().charAt(0);

                    if (nav == 'y' || nav == 'Y') {
                        exit = true;
                        System.out.println("Program akan keluar...");
                    } else
                        System.out.println("Menuju menu utama...");
                    break;

                default:
                    System.out.println("Input salah!");
                    break;
            }
            System.out.println("\nTekan sembarang tombol untuk melanjutkan...");
            input.nextLine();
            System.out.println();
        }
    }
}
