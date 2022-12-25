/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecbangundatar;

/**
 *
 * @author ASUS
 */
public class ProjecBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Memberi Atribut persegi panajang C
        persegiPanjang C = new persegiPanjang();
        C.panjang = 17;
        C.lebar = 8;
        //Menghitung luas dan keliling Persegi panjang C
        System.out.println("luas dan keliling Persegi Panjang C :");
        C.hitungLuas();
        C.hitungKeliling();
        
        /// Memberi Atribut persegi panajang D
        persegiPanjang D = new persegiPanjang();
        D.panjang = 26;
        D.lebar = 14;
        System.out.println("luas dan keliling Persegi Panjang D : ");
        D.hitungLuas();
        D.hitungKeliling();
        
        //Memberi Atribut jari jari lingkaran L1
        Lingkaran L1 = new Lingkaran ();
        L1.jari2 = 6;
        
        // Menghitung luas dan keliling dari L1
        System.out.println("Luas dan Keliling dari lingkaran L1:");
        L1.hitungKeliling();
        L1.hitungLuas();
        
        //Memberi Atribut jari jari lingkaran L2
        Lingkaran L2 = new Lingkaran ();
        L2.jari2 = 12;
        
        //Menghitung luas dan keliling dari L2
        System.out.println("Luas dan Keliling dari lingkaran L2");
        L2.hitungKeliling();
        L2.hitungLuas();
        
    }
    
}
