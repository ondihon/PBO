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
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // membuat obyek persegi panjang A
        PersegiPanjang A = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari A
        A.panjang = 10;
        A.lebar = 7;
        
        // menghitung luas dan keliling dari A
        System.out.println("Panjang : " + A.panjang);
        System.out.println("Lebar : " + A.lebar);

        A.kelilingPersegiPanjang();
        A.luasPersegiPanjang();
        
        // membuat obyek persegi panjang B
        PersegiPanjang B = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        B.panjang = 14;
        B.lebar = 9;
        
        // menghitung luas dan keliling dari B
        B.kelilingPersegiPanjang();
        B.luasPersegiPanjang();
        
        // membuat obyek persegi panjang C
        PersegiPanjang C = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari C
        C.panjang = 17;
        C.lebar = 8;
        
        // menghitung luas dan keliling dari C
        C.luasPersegiPanjang();
        C.kelilingPersegiPanjang();
        
        // membuat obyek persegi panjang D
        PersegiPanjang D = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari D
        D.panjang = 26;
        D.lebar = 14;
        
        // menghitung luas dan keliling dari D
        D.luasPersegiPanjang();
        D.kelilingPersegiPanjang();
        
         // membuat obyek persegi panjang L1
        Lingkaran L1 = new Lingkaran();
        
        // memberi nilai atribut panjang & lebar dari L1
        L1.jejari = 6;
        
        // menghitung luas dan keliling dari L1
        L1.hitungKeliling();
        L1.hitungLuas();
        
        
         // membuat obyek persegi panjang L2
        Lingkaran L2 = new Lingkaran();
        
        // memberi nilai atribut panjang & lebar dari L2
        L2.jejari = 12;
        
        // menghitung luas dan keliling dari L2
        L2.hitungKeliling();
        L2.hitungLuas();

    }
    
}
