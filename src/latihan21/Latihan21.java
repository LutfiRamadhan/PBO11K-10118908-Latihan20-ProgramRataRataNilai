/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan21;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float rata_rata = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jml_mahasiswa = scanner.nextInt();
        for (int i = 1; i <= jml_mahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            int nilai_mahasiswa = scanner.nextInt();
            rata_rata += nilai_mahasiswa;
        }
        rata_rata /= jml_mahasiswa;
        System.out.println("Maka, Rata-rata Nilainya adalah "+rata_rata);
        System.out.println("Developed by : Lutfi Ramadhan");
    }
    
}
