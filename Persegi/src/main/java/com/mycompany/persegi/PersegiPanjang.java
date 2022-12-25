/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persegi;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang {
    //atribut
    int panjang;
    int lebar;

    //method
    //method untuk luas persegiPanjang
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Luasnya : " + luas);
    }
    
   
    //method untuk keliling persegiPanjang
    void hitungKeliling(){
        int keliling = 2 * (this.panjang + this.lebar);
        System.out.println("Kelilingnya : " + keliling);
    }
    
}
