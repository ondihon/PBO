/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectsiakad;
import java.time.*;
/**
 *
 * @author asus
 */
public class ProjectSIAKAD {

    public static void main(String[] args) {
        // contoh obyek data pegawai
        Pegawai p1 = new Pegawai("P01", "Rosihan Ari", 2, LocalDate.of(1979, 9, 1));
        p1.printPegawai();
         
        // contoh obyek data pegawai dosen
        Dosen p2 = new Dosen("P02", "Dwi Amalia Fitriani", 1, LocalDate.of(1979, 9, 17), "8888");
        p2.printPegawai();
         
        // contoh obyek data pegawai nondosen
        NonDosen p3 = new NonDosen("P03", "Faza Fauzan K", 1, LocalDate.of(2008, 1, 25));
        p3.printPegawai();
    }
}
