/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modifier;

/**
 *
 * @author asus
 */
public class persegiPanjang {
    int panjang;
    int lebar;
    
    private int hitungLuas(){
        int luas = panjang*lebar;
        return luas;
    }
    
    private int hitungKeliling(){
        int keliling = 2*(panjang*lebar);
        return keliling;
    }
    
    void output(){
        this.hitungKeliling();
        this.hitungLuas();
        System.out.println("Keliling = " + this.hitungKeliling());
        System.out.println("Luas = " + this.hitungLuas());
    }
}
