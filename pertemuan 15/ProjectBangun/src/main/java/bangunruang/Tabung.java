/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class Tabung extends BangunRuang {
    // atribut jari-jari
    public double jejari;
    public double tinggi;
    
    // method untuk hitung Volum tabung
    public double hitungVolume(){
        return Math.PI * this.jejari * this.jejari * this.tinggi;
    }
    
    // method untuk hitung luas permukaan tabung
    public double hitungLuasPermukaan(){
        return Math.PI * this.jejari * this.jejari;
    }
}
