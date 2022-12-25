/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecbangundatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    // Atribut
    int jari2;
    
    //Method
    //Method menghitung luas lingkaran
    void hitungLuas(){
        double luas = 3.14 * jari2 * jari2;
        System.out.println("Luasnya : " + luas);
    }
    //Method menghitung keliling lingkaran
    void hitungKeliling(){
        double keliling = 2 * 3.14 * jari2;
        System.out.println("Kelilingnya : " + keliling);
    }
}
