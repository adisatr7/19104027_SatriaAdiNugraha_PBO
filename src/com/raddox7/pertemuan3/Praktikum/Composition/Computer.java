/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Praktikum.Composition;

public class Computer {

    // Components
    private String type;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private CPU cpu;

    // Constructor
    public Computer(String type) {
        this.type = type;
    }

    // Assigns 'devices' to the main 'computer'
    public void addComponent(Keyboard keyboard, Mouse mouse, Monitor monitor, CPU cpu) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.cpu = cpu;
    }

    // Getter & Setter from this point on~~
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
