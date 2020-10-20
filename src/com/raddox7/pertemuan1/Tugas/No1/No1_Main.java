/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Tugas.No1;

import java.util.Scanner;

public class No1_Main {
    static double CtoF(double c) {
        return (c * 9 / 5) + 32;
    }

    static double FtoK(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    static double KtoR(double k) {
        return (k - 273.15) * 0.8;
    }

    static double RtoC(double r) {
        return r * 0.8;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Suhu");
        System.out.println();
        System.out.println("1) Celsius -> Fahrenheit");
        System.out.println("2) Fahrenheit -> Kelvin");
        System.out.println("3) Kelvin -> Reaumur");
        System.out.println("4) Reaumur -> Celsius");
        System.out.print("> ");

        char nav = input.nextLine().charAt(0);
        System.out.println();

        switch (nav) {
            case '1':
                System.out.print("Masukan suhu dalam satuan celsius: ");
                double celsius = input.nextDouble();
                System.out.println("Hasil: " + celsius + " celsius = " + CtoF(celsius) + " fahrenheit");
                break;

            case '2':
                System.out.print("Masukan suhu dalam satuan fahrenheit: ");
                double fahrenheit = input.nextDouble();
                System.out.println("Hasil: " + fahrenheit + " fahrenheit = " + FtoK(fahrenheit) + " kelvin");
                break;

            case '3':
                System.out.print("Masukan suhu dalam satuan kelvin: ");
                double kelvin = input.nextDouble();
                System.out.println("Hasil: " + kelvin + " kelvin = " + KtoR(kelvin) + " reaumur");
                break;

            case '4':
                System.out.print("Masukan suhu dalam satuan reaumur: ");
                double reaumur = input.nextDouble();
                System.out.println("Hasil: " + reaumur + " reaumur = " + RtoC(reaumur) + " celsius");
                break;

            default:
                System.out.println("Input error!");
                break;
        }
        System.out.println("\nMenutup program...");
    }
}
