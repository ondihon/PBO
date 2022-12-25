/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class Bola extends BangunRuang{
    // atribut
    public double jejari;
    
    // method untuk hitung Volum Balok
    public double hitungVolume(){
        return (4/3) * Math.PI * this.jejari * this.jejari * this.jejari;
    }
    
    // method untuk hitung luas permukaan Balok
    public double hitungLuasPermukaan(){
        return 4 * Math.PI * this.jejari * this.jejari;
    }
}
