package p02_JavaPractise;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Y/N ikilisinden birini giriniz  ");
        char karakter = scan.next().charAt(0);  // ne yazarsa yazsin ilk harfi yaz

        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("YES");

        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("NO");

        } else System.out.println("Yanlis giris yaptiniz lutfen Y/N ikilisinden birini yaziniz"); // kod body si
        // tek satirsa parantez olmadan da olur


    }




}
