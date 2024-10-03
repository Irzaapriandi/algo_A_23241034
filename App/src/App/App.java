/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import java.util.Scanner;

class Kalkulator {
      
    public double perkalian(double a, double b){
        return a * b;
    }
    public double pembagian (double a, double b){
        return a / b;
    }
    public double penjumlahan(double a, double b){
        return a + b;
    }
    public double pengurangan(double a, double b){
        return a - b;
    }
}

/**
 *
 * @author Laptop
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        Kalkulator kalkulator = new Kalkulator();
        
        char lanjutkan = 'y';
        
        while (lanjutkan == 'y') {
            
            System.out.println("\n==================");
            System.out.println("|      MENU      |");
            System.out.println("|================|");
            System.out.println("| 1. Perkalian   |");
            System.out.println("| 2. Pembagian   |");
            System.out.println("| 3. Penjumlahan |");
            System.out.println("| 4. Pengurangan |");
            System.out.println("==================");
            
            System.out.print("Masukkan Pilihan Anda : ");
            int pilihan = input.nextInt();
            
            System.out.print("Masukkan Bilangan 1 : ");
            double bil1 = input.nextDouble();
            System.out.print("Masukkan Bilangan 2 : ");
            double bil2 = input.nextDouble();
            
            double hasil = 0;
            
            if (pilihan == 1){
                hasil = kalkulator.perkalian(bil1, bil2);
            } else if (pilihan == 2){
                hasil = kalkulator.pembagian(bil1, bil2);
            } else if (pilihan == 3){
                hasil = kalkulator.penjumlahan(bil1, bil2);
            } else if (pilihan == 4){
                hasil = kalkulator.pengurangan(bil1, bil2);
            } else {
                System.out.println("Pilihan tidak valid");
            }
            System.out.println("Hasil : " + hasil);
            
            System.out.print("Mau Lagi (y/n) : ");
            lanjutkan = input.next().charAt(0);
        }
        
        System.out.println("Terimaksih");

    }
    
}