/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar3;

/**
 *
 * @author ASUS
 */
public class lingkaran {
    double jejari;
    
    lingkaran(double r){
        this.jejari = r;
    }
    
    void output(){
        double keliling = 2*3.14*this.jejari;
        double luas = 3.14*this.jejari*this.jejari ;
        
        System.out.println("jejari      : " + this.jejari);
        System.out.println("keliling    : " + keliling);
        System.out.println("luas        : " + luas);
    }
}
