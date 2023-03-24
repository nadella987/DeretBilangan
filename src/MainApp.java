/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim;
        int jumlahAngka;
        char pilihan;

        do {
            // input nama
            do {
                System.out.print("Masukkan Nama Anda [1..25] : ");
                nama = input.nextLine();
            } while (nama.length() < 1 || nama.length() > 25);

            // input NIM
            do {
                System.out.print("Masukkan NIM Anda (harus 10 karakter): ");
                nim = input.nextLine();
            } while (nim.length() != 10);
            
             System.out.println("");
             System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
             System.out.println("");
             System.out.println("Registrasi Sukses..");
             System.out.println("Selamat Datang " + nama + " [" + "NIM :" + nim + "].. ^^v");
             System.out.println("");
             System.out.println("Mari belajar macam-macam deret bilangan..");
             
             System.out.println("");
             System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
             System.out.println("");
             
            // input jumlah angka
            do {
                System.out.print("Masukkan Sembarang Angka [5..20]: ");
                jumlahAngka = input.nextInt();
                input.nextLine();
            } while (jumlahAngka < 5 || jumlahAngka > 20);
            
            System.out.println("");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            
            System.out.println("Deret Bilangan");
            System.out.println("################");
            System.out.println("");
            
            // tampilkan deret bilangan
            System.out.println(" 20 Deret Bilangan Genap:");
            int sumGenap = 0;
            for (int i = 1; i <= jumlahAngka; i++) {
                int bilangan = 2 * i;
                sumGenap += bilangan;
                System.out.print(bilangan + " ");
            }
            System.out.println("\nHasil Penjumlahan = " + sumGenap);
            System.out.println("");

            System.out.println(" 20 Deret Bilangan Ganjil:");
            int sumGanjil = 0;
            for (int i = 0; i < jumlahAngka; i++) {
                int bilangan = 2 * i + 1;
                sumGanjil += bilangan;
                System.out.print(bilangan + " ");
            }
            System.out.println("\nHasil Penjumlahan = " + sumGanjil);
            System.out.println("");

            System.out.println(" 20 Deret Bilangan Fibonacci:");
            int sumFibonacci = 0;
            int f1 = 0, f2 = 1;
            for (int i = 0; i < jumlahAngka; i++) {
                int bilangan = f2;
                sumFibonacci += bilangan;
                System.out.print(bilangan + " ");
                f2 = f1 + f2;
                f1 = bilangan;
            }
            System.out.println("\nHasil Penjumlahan = " + sumFibonacci);
            System.out.println("");

            // ulang program
            do {
                System.out.print("Anda ingin mengulang [y/t] : ");
                pilihan = input.nextLine().charAt(0);
            } while (pilihan != 'Y' && pilihan != 'y' && pilihan != 'T' && pilihan != 't');

        } while (pilihan == 'Y' || pilihan == 'y');
    }
    
}
