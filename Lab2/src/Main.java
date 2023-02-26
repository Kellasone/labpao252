import package1.Masina;

import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int numarInBaza10 = 17; // numar in baza 10
        int numarInBaza2 = 0B10001; //tot 17 dar in baza 2
        int numarInBaza8 = 021; // tot 17 dar in baza 8
        int numarInBaza16 = 0x11; // tot 17 dar in baza 16

        if (numarInBaza2 == numarInBaza10)
            System.out.println("sunt egale");
        else
            System.out.println("nu sunt egale");

        //1octet = 1 byte == byte
        //2^8-1 = 255
        // -2^7 -> 2^7-1

        //2 octet = 2 bytes = short
        //2^16-1 numere
        //-2^15 -> 2^15-1

        //4 octeti = 4 bytes = int
        //2^32-1 numere
        //-2^31 -> 2^31-1

        //byte a = 2;  //working
        //byte a = 128;   // not working

        Long numarLong = 2L;
//        Long numarLong = 2; //not working

//        int numarCuVirgula = 2.5;
        float numarCuVirgula = 2.5f;

        boolean tipBool = true; // sau false; nu accepta 0 sau 1
        char oLitera = 'a';
        String unCuvant = "adsaasd";

//        int private
//          int import;


        // 0x00000000 -> 0x10000000

        Masina m = new Masina(); //obiectul m este alocat in heap

        System.out.println(m);
        int a;
        Integer b;


        //unboxing si autoboxing

        //enhanced for

        int[] numere = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : numere) System.out.println(x);


       //import masina
        Date d;
        java.sql.Date d2;

        //Citire de la tastatura
        Scanner sc = new Scanner(System.in);

    }
}