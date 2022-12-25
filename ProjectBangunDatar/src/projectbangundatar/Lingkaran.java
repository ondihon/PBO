/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author hanizar
 */
public class Lingkaran {
    int jejari;
    
    void hitungLuas() {
        double luas = 3.14 * jejari * jejari;
        System.out.println("Luas Lingkaran : " + luas);
    }
    
    void hitungKeliling() {
        double keliling = 2 * 3.14 * jejari;
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}
