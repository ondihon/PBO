/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation;

/**
 *
 * @author asus
 */
public class Lingkaran {
    //atribut
    private int jejari;
    private double luas;
    
    //setter method untuk jejari
    public void setJejari(int r){
        if (r > 0) {
            this.jejari = r;
        }else{
            this.jejari = 0;
        }
    }
    
    //getter method untuk luas
    public double getLuas(){
        //hitung luas
        this.luas = Math.PI * Math.pow(this.jejari, 2);
        return this.luas;
    }
}
