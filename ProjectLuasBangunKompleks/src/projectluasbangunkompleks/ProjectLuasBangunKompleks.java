/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkompleks;

/**
 *
 * @author ASUS
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persegi x = new persegi();
        x.s = 42;
        
        lingkaran a = new lingkaran();
        a.jejari = 21;
        
        lingkaran b = new lingkaran();
        b.jejari = 21;
        
        double totalLuas = x.hitungLuas(x.s) + b.hitungLuas(a.jejari) + b.hitungLuas(b.jejari);
        
        System.out.println("luas totalnya adalah = " + totalLuas + "cm");
    }
}
