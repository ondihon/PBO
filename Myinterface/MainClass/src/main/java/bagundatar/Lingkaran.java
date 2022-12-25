/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagundatar;

/**
 *
 * @author asus
 */
public class Lingkaran extends BangunDatar implements Keliling, Simetri {
    // atribut 
    public int jejari;

    //methods
    
    @Override
    public double hitungLuas(){
        return Math.PI * this.jejari * this.jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * Math.PI * this.jejari;
    }
    
    @Override
    public double hitungSimPutar(){
        return Double.POSITIVE_INFINITY;
    }
    
    @Override
    public double hitungSimLipat(){
        return Double.POSITIVE_INFINITY;
    }
    @Override
    public void tampilHasil(){
        System.out.println("Lingkaran");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("KelilingNya: " + this.hitungKeliling());
        System.out.println("Simetri Lipat: " + this.hitungSimLipat());
        System.out.println("Simetri Putar: " + this.hitungSimPutar());
    }

}
