/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar3;

/**
 *
 * @author ASUS
 */
public class ProjectBangunDatar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //persegi panjang
        persegiPanjang a = new persegiPanjang(10, 5);
        persegiPanjang b = new persegiPanjang(3.6, 8);
        persegiPanjang c = new persegiPanjang(6, 8.3);
        persegiPanjang d = new persegiPanjang(5.6, 8.8);
        
        System.out.println("Keliling dan luas bangun datar persegi pangjang");
        a.output();
        b.output();
        c.output();
        d.output();
        
        
        //persegi
        persegi sa = new persegi(4.5);
        persegi sb = new persegi(7);

        System.out.println("Keliling dan luas bangun datar persegi");
        sa.output();
        sb.output();
        
        //lingkaran
        lingkaran la = new lingkaran(5);
        lingkaran lb = new lingkaran(7.4);
        
        System.out.println("Keliling dan luas bangun datar lingkaran");
        la.output();
        lb.output();
        
        //segitiga
        segitiga s1 = new segitiga(8, 10);
        segitiga s2 = new segitiga(8, 11.5);
        segitiga s3 = new segitiga(12.2, 9);
        segitiga s4 = new segitiga(13.9, 20.7);
        
        System.out.println("Luas bangun datar segitiga");
        s1.output();
        s2.output();
        s3.output();
        s4.output();
    }
    
}
