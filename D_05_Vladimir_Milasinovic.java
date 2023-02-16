package Domaci;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DomaciPet {
    public static void main(String[] args) {

        //2. Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi)
        // nakon toga, uneti neku godinu izdanja knjige, ukoliko su Triler i Romantika
        //starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru,
        // takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
        //ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi zanr knjige Romantika, Triler, Horor ili Krimi");
        String knjiga = sc.next();
        System.out.println("Unesi godinu izdanja knjige");
        int izdanje = sc.nextInt();
        int godina = 2022;
        int rezultat = (godina - izdanje);
        switch (knjiga) {
            case "Triler":
                if (rezultat > 30) {
                    System.out.println("Zanr knjige vise nije na lageru");
                } else if (rezultat<30)
                    System.out.println("Zanr knjige je na lageru");
                break;
        }
        switch (knjiga) {
            case "Romantika":
                if (rezultat > 30) {
                    System.out.println("Zanr knjige vise nije na lageru");
                }
            else if (rezultat<30)
                    System.out.println("Zanr knjige je na lageru");
                break;
            case "Horor":
                if (rezultat > 40) {
                    System.out.println("Zanr knjige je na lageru");

                } else if (rezultat<40)
                    System.out.println("Zanr knjige vise nije na lageru");
                break;
            case "Krimi":
                if (rezultat > 20) {
                    System.out.println("Zanr knjige je na lageru");
                } else if (rezultat<20)
                    System.out.println("Zanr knjige vise nije na lageru");
                break;
            default:
                System.out.println("Zanr knjige nije na lageru");
                break;
        }
    }
}

