/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persegipanjang;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang {

    /**
     * @param args the command line arguments
     */
    
    //Atribut
    int panjang;
    int lebar;
    //Method
    //method menentukan luas
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("luasnya : " + luas);
    }
    //methid menentukan keliling
    void hitungKeliling(){
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Kelilingnya = " + keliling);
    }
    public static void main(String[] args) {
        // Persegi Panajang C
        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 17;
        C.lebar = 8;
        System.out.println("Persegi Panjang C:");
        C.hitungLuas();
        C.hitungKeliling();
        // Persegi Panjang D
        PersegiPanjang D = new PersegiPanjang();
        D.panjang = 26;
        D.lebar = 14;
        System.out.println("Persegi Panajang D: ");
        D.hitungLuas();
        D.hitungKeliling();
        
    }
    
}
