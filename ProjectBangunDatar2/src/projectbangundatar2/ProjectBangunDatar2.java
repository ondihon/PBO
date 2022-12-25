/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar2;

/**
 *
 * @author ASUS
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persegiPanjang a = new persegiPanjang();
        System.out.println("luas persegi panjang");
        a.hitungLuas(10, 5);
        a.hitungLuas(3.6, 8);
        a.hitungLuas(6, 8.3);
        a.hitungLuas(5.6, 8.8);
        System.out.println("keliling persegi panjang");
        a.hitungKeliling(10, 5);
        a.hitungKeliling(3.6, 8);
        a.hitungKeliling(6, 8.3);
        a.hitungKeliling(5.6, 8.8);
        
        persegi b = new persegi();
        System.out.println("luas persegi");
        b.hitungLuas(4.5);
        b.hitungLuas(7);
        System.out.println("keliling persegi");
        b.hitungkeliling(5);
        b.hitungKeliling(7);
        
        lingkaran c = new lingkaran();
        
        segitiga d = new segitiga();
        
    }
    
}
