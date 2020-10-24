/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Composition;

public class DemoComputer {
    public static void main(String[] args) {

        // Constructs 'computer' object
        Computer computer = new Computer("Gaming");

        // Construct these components
        Keyboard keyboard = new Keyboard("Sades", "Mechanical");
        Mouse mouse = new Mouse("Razer", "800");
        Monitor monitor = new Monitor("Armagedon", "24", "144");
        CPU cpu = new CPU("Intel Core i7", "nVidia RTX 3070Ti", "32");

        // Adds those components into the computer
        computer.addComponent(keyboard, mouse, monitor, cpu);

        // Prints out computer type
        System.out.println("Computer type: " + computer.getType());
        System.out.println();

        // Prints out specs from CPU class
        System.out.println("System Specs");
        computer.getCpu().printSpec();

        // Prints out specs from Keyboard class
        System.out.println("Keyboard Specs");
        computer.getKeyboard().printSpec();

        // Prints out specs from Mouse class
        System.out.println("Mouse Specs");
        computer.getMouse().printSpec();

        // Prints out specs from Monitor class
        System.out.println("Monitor Specs");
        computer.getMonitor().printSpec();
    }
}
