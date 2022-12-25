package projectbangundatar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanizar
 */
public class PersegiPanjang {
    
    int panjang;
    int lebar;
    
    void kelilingPersegiPanjang() {
        int keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }
    
    void luasPersegiPanjang() {
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }
    
}
