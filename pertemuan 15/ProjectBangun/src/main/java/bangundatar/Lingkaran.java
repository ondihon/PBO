/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author asus
 */
public class Lingkaran extends BangunDatar {
    // atribut jari-jari
    public double jejari;
    
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        return Math.PI * this.jejari * this.jejari;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	  return 2 * Math.PI * this.jejari;
    }

}
