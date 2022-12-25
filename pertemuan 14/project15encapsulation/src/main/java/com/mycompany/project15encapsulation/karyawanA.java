/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project15encapsulation;

/**
 *
 * @author asus
 */
public class karyawanA {
    //atribut
    String nama;
    String nik;
    protected int gajiPokok = 3000000;
    protected int masaKerja;
    protected int tunjangan;
    protected int totalGaji;
    
    
    
    //setter mthod masa kerja
    public void setMasaKerja(int mk){
        if (mk > 0){
            this.masaKerja = mk;
        }else{
            System.out.println("input yang dimasukan salah");
            System.exit(0);
        }
    }
    
    void setTunjangan(){
        if (this.masaKerja > 10){
            this.tunjangan = 2000000;
        }else {
            this.tunjangan = 3000000;
        }
    }
    
    void setTotalGaji(){
        //hitung gaji tottal
        this.totalGaji = this.gajiPokok + this.tunjangan;
    }
    
    void print(){
        setTunjangan();
        setTotalGaji();
        System.out.println("nama        " + nama);
        System.out.println("NIK         " + nik);
        System.out.println("Masa kerja  " + masaKerja);
        System.out.println("-----------------------------------");
        System.out.println("Gaji Pokok  " + gajiPokok);
        System.out.println("Tunjangan   " + tunjangan);
        System.out.println("-----------------------------------");
        System.out.println("Total gaji  "+ totalGaji);
    }
}
