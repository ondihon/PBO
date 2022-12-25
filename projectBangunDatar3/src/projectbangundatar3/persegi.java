/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar3;

/**
 *
 * @author ASUS
 */
public class persegi {
    double sisi;
    
    persegi(double s){
        this.sisi = s;
    }
    
    void output(){
        double keliling = 4*this.sisi ;
        double luas = this.sisi*this.sisi;
        
        System.out.println("sisi        : " + this.sisi);
        System.out.println("keliling    : " + keliling);
        System.out.println("luas        : " + luas);
    }
}
