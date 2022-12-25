/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraksi;

/**
 *
 * @author asus
 */
public abstract class BangunDatar {
 
    //method abstract
    abstract double hitungLuas();
    abstract double hitungKeliling();
    
    void tampilHasil(){
        System.out.println("Luasnya:: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }
}
