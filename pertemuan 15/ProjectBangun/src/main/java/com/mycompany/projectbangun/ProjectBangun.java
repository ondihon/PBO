/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectbangun;
import bangundatar.BangunDatar;
import bangundatar.Persegi;
import bangundatar.Lingkaran;
import bangundatar.PersegiPanjang;

import bangunruang.BangunRuang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author asus
 */
public class ProjectBangun {

    public static void main(String[] args) {
        System.out.println("Persegi");
        Persegi p1 = new Persegi();
        p1.sisi = 5;
        p1.tampilHasil();
        
        System.out.println("Balok");
        Balok b1 = new Balok();
        b1.lebar = 3;
        b1.panjang = 2;
        b1.tinggi = 4;
        b1.tampilHasil();
    }
}
