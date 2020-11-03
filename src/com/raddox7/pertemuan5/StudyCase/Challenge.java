/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan5.StudyCase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        boolean isWrong = true;
        int index = 0;

        while (isWrong) {
            try {
                System.out.print("Input length array: ");
                index = intInputMethod();
                isWrong = false;
            } catch (InputMismatchException e) {
                System.out.println("Masukan angka!");
            }
        }

        int[] array = new int[index];

        System.out.println("Masukan Data!");
        for (int i = 0; i < array.length; i++) {
            isWrong = true;
            while (isWrong) {
                try {
                    System.out.print("Index ke-" + i + "\t: ");
                    array[i] = intInputMethod();
                    isWrong = false;
                } catch (InputMismatchException e) {
                    System.out.println("Masukan angka!");
                }
            }
        }

        System.out.println("\nOutput\t: ");
        for (int x : array)
            System.out.println("Data\t: " + x);
    }

    public static int intInputMethod() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
