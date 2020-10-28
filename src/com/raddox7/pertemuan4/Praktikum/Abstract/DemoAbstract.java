/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Praktikum.Abstract;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] myPets = {
                new Burung("Beo"),
                new Kambing("Etawa"),
                new Kucing("Persia"),
                new Anjing("Cihuahua")
        };

        Binatang favPet;
        Random random = new Random();

        favPet = myPets[random.nextInt(myPets.length)];

        System.out.println("Binatang kesayangan anda adalah " + favPet);
        System.out.print("Suaranya ");
        favPet.suara();
    }
}
