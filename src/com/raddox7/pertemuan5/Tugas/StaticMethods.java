/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan5.Tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StaticMethods {

    // Method mengambil inputan bilangan bulat dari user
    public static int getInt(String prompt) {
        Scanner input = new Scanner(System.in);
        int integer;
        while (true) {
            System.out.print(prompt);
            try {
                integer = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Tolong HANYA masukan angka saja!");
                input.nextLine();
            }
        }
        return integer;
    }

    // Method untuk mengisi array
    public static void fillUID(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getInt("Masukan UID\t: ");
            System.out.println(array[i] + " berhasil ditambahkan ke index ke-" + i + "!");
        }
    }

    // Method menampilkan isi nilai index array tertentu
    public static void getValue(int[] array, int index) {
        try {
            System.out.println("Data ke-" + (index + 1) + "\t: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index tidak benar!");
        }
    }

    // Method untuk menangkap user input sebagai char
    public static char getChar(String prompt) {
        Scanner input = new Scanner(System.in);
        char c;
        while (true) {
            System.out.print(prompt);
            try {
                c = input.nextLine().charAt(0);
                break;
            } catch (InputMismatchException | StringIndexOutOfBoundsException e) {
                System.out.println("Error: Mohon coba sekali lagi!");
            }
        }
        return c;
    }

    // Method untuk menentukan apakah ingin mengakhiri program sekarang
    public static boolean confirmExit() {
        boolean exit = false;
        boolean isValid = false;
        while (!isValid) {
            char confirm = getChar("Lihat lagi? (y/n)\n> ");
            if (confirm == 'n' || confirm == 'N') {
                exit = true;
                isValid = true;
            } else if (confirm == 'y' || confirm == 'Y')
                isValid = true;
            else
                System.out.println("Error: Harap masukan yang benar!");
        }
        return exit;
    }
}
