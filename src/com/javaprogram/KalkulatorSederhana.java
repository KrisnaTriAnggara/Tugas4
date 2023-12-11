package com.javaprogram;

import java.util.Scanner;
public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, pilihan, hasil = 0;
        System.out.println("----Keterangan Operasi : ------");
        System.out.println("1. Penjumlahan : +");
        System.out.println("2. Pengurangan : -");
        System.out.println("3. Pembagian : /");
        System.out.println("4. Perkalian : *");
        System.out.println("5. Sisa Bagi : %");


        System.out.println("Masukkan angka pertama : ");
        angka1 = input.nextInt();
        System.out.println("Masukkan angka kedua :");
        angka2 = input.nextInt();

        System.out.println("masukkan operasi");
        pilihan = input.nextInt();

        switch ( pilihan ) {
            case 1 : hasil = angka1 + angka2;
            break;
            case 2 : hasil = angka1 - angka2;
            break;
            case 3 : 
            if ( angka2 == 0) {
                System.out.println(" Anda tidak boleh membagi dengan angka nol ");
            } else  {
                hasil = angka1 / angka2;
            }
                System.out.println("Hasil :" + hasil);
            break;
            case 4 : hasil = angka1 * angka2;
            break;
            case 5 : hasil = angka1 % angka2;
            break;
            default: System.out.println(" Hasil tidak ada ");
        }
        System.out.println("Hasil :" + hasil);

    }

}
