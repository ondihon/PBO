/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author asus
 */
public class PersegiPanjang extends BangunDatar {
    //atibut
    public int panjang;
    public int lebar;
     
    //method hitung luas
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
     
    //method hitung keliling
    public double hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
