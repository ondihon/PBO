/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation;

/**
 *
 * @author asus
 */
public class PersegiPanjang {
    //atribut
    private int panjang;
    private int lebar;
    private double luas;
    private double keliling;
    
    //setter method untuk panajang
    public void setPanjang(int p){
        if (p > 0) {
            this.panjang = p;
        }else{
//            System.out.println("nilai tidak valid");
//            System.exit(0);
            this.panjang = 0;
        }
    }
    
    //setter method untuk lebar
    public void setLebar(int l){
        if (l > 0) {
            this.lebar = l;
        }else{
            this.lebar = 0;
        }
    }
    
    //return atribut lebar
    int getLebar(){
        return this.lebar;
    }
    
    //return atribut panjang
    int getPanajang(){
        return this.panjang;
    }
    
    //getter method untuk luas
    public double getLuas(){
        //hitung luas
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
    
    //getter method untuk keliling
    public double getKeliling(){
        //hitung keliling
        this.keliling = this.panjang * this.lebar;
        return this.keliling;
    }
}
