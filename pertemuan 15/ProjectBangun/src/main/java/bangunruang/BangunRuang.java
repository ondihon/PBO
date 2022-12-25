/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author asus
 */
public abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
    
    public void tampilHasil(){
        System.out.println("Volume: " + this.hitungVolume());
        System.out.println("Luasnya: " + this.hitungLuasPermukaan());
    }
}
