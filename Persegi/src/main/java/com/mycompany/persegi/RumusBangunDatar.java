/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.persegi;

/**
 *
 * @author ASUS
 */
public class RumusBangunDatar {
    // atribut
    int sisi;
    
    //method
    void hitungLuas(){
        int luas = this.sisi + this.sisi;
        System.out.println("Luasnya :" + luas);
    }
    
    void hitungKeliling(){
        int keliling = this.sisi * 4;
        System.out.println("Kelilingnya :" + keliling);
    }

    public static void main(String[] args) {
        RumusBangunDatar p1 = new RumusBangunDatar();
        p1.sisi = 10;
        p1.hitungLuas();
        p1.hitungKeliling();
        
        
    }
}
