/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkomplek;

/**
 *
 * @author ASUS
 */
public class ProjectLuasBangunKOmplek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        lingkaran a = new lingkaran();
        a.jejari = 14;
        
        lingkaran b = new lingkaran();
        b.jejari = 7;
        
        lingkaran c = new lingkaran();
        c.jejari = 7;
        
        double totalLuas = a.luasSetengahlingkaran() - b.luasSetengahlingkaran() - c.luasSetengahlingkaran();
        
        System.out.println("Total luasnya adalah: " + totalLuas + "cm" );
    }
    
}
