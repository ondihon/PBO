/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagundatar;

/**
 *
 * @author asus
 */
public class Segitiga extends BangunDatar {
    // atribut
    public int alas;
    public int tinggi;
    
    //methods
    
    @Override
    public double hitungLuas(){
        return 1/2 * (this.alas * this.tinggi);
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Segitiga");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
    }
}
