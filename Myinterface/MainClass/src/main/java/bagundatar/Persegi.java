/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagundatar;

/**
 *
 * @author asus
 */
public class Persegi extends BangunDatar implements Keliling, Simetri {
    // atribut
    public int sisi;
    
    // methods
    
    @Override
    public double hitungLuas(){
        return this.sisi * this.sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return 4 * this.sisi;
    }
    
    @Override
    public double hitungSimPutar(){
        return 4.0;
    }
    
    @Override
    public double hitungSimLipat(){
        return 4.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Persegi");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("KelilingNya: " + this.hitungKeliling());
        System.out.println("Simetri Lipat: " + this.hitungSimLipat());
        System.out.println("Simetri Putar: " + this.hitungSimPutar());
    }
}
