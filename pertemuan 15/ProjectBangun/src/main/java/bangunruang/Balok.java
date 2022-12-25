/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class Balok extends BangunRuang {
    // atribut
    public int panjang;
    public int lebar;
    public int tinggi;
    
    // method untuk hitung Volum Balok
    public double hitungVolume(){
        return this.panjang * this.lebar * this.tinggi;
    }
    
    // method untuk hitung luas permukaan Balok
    public double hitungLuasPermukaan(){
        return this.panjang * this.lebar;
    }
}
