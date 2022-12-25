/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.encapsulation;

/**
 *
 * @author asus
 */
public class Encapsulation {

    public static void main(String[] args) {
        //hitung luas segitiga ADE
        Segitiga st1 = new Segitiga();
        st1.setAlas(8);
        st1.setTinggi(7);
        double luasADE = st1.getLuas();
        
        //hitung luas segtiga CBF
        Segitiga st2 = new Segitiga();
        st2.setAlas(8);
        st2.setTinggi(7);
        double luasCBF = st2.getLuas();
        
        //hitung luas CDEF
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(14);
        pp1.setLebar(7);
        double luasCDEF = pp1.getLuas();
        
        //hitung luas setegah lingkaran x
        Lingkaran l1 = new Lingkaran();
        l1.setJejari(7);
        double luasX = 0.5 * l1.getLuas();
        
        //hitung luas daerah di arsir
        double luasArsir = luasADE + luasCBF + luasCDEF - luasX;
        System.out.println("Luas daerah yang diarsir: " + luasArsir + " cm2");
        
//        System.out.println("Panjang persegi panjang " + pp1.getPanajang() + " lebar persegi panjang " + pp1.getLebar());
    }
}
