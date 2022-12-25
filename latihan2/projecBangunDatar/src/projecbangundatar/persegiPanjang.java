/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecbangundatar;

/**
 *
 * @author ASUS
 */
public class persegiPanjang {
    //Atribut
    int panjang;
    int lebar;
    //Method
    //method menentukan luas
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("luasnya : " + luas);
    }
    //method menentukan keliling
    void hitungKeliling(){
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Kelilingnya = " + keliling);
    }
}
