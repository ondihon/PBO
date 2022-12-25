/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar3;

/**
 *
 * @author ASUS
 */
public class persegiPanjang {
    
    double pangjang;
    double lebar;
    
    persegiPanjang(double p, double l){
        this.pangjang = p;
        this.lebar = l;
    }
    
    void output(){
        double keliling = 2 * (this.lebar+this.pangjang);
        double luas = this.lebar*this.pangjang;
        
        System.out.println("lebar       : " + this.lebar);
        System.out.println("panjang     : " + this.pangjang);
        System.out.println("keliling    : " + keliling);
        System.out.println("luas        : " + luas);
    }
}
