/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project15encapsulation;

/**
 *
 * @author asus
 */
public class karyawanB extends karyawanA{
    void setTunjangan(){
        if(this.masaKerja > 10){
            this.tunjangan = 6000000;
        }else{
            this.tunjangan = 4000000;
        }
    }
    
}
