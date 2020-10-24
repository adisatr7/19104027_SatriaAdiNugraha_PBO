/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    // Not in the diagram, but whatever. I need this...
    List<Planet> planets = new ArrayList<>();
    // Attributes
    private String id;
    private String nama;

    // Constructor
    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Returns total member of planets in the solar system
    public int getTotalMember() {
        int counter = 0;
        for (Planet planet : planets)
            counter++;
        return counter;
    }

    // Returns the planets list
    public List<Planet> getPlanets() {
        return planets;
    }

    // Sets a group of planets into the solar system
    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    // Returns the ID of the solar system
    public String getId() {
        return id;
    }

    // Returns the name of the solar system
    public String getNama() {
        return nama;
    }

    // Prints out the complete date of the solar system
    public void getData() {
        System.out.println("All planets inside " + getNama() + ":");
        for (Planet planet : planets)
            System.out.println("- " + planet.getNamaPlanet());
    }
}
