/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar3;

/**
 *
 * @author ASUS
 */
public class segitiga {
    double alas;
    double tinggi;
    
    segitiga(double a, double t){
        this.alas = a;
        this.tinggi = t;
    }
    
    void output(){
        double luas = this.alas*this.tinggi/2;
        
        System.out.println("alas        : " + this.alas);
        System.out.println("tinggi      : " + this.tinggi);
        System.out.println("luas        : " + luas);
    }
}
