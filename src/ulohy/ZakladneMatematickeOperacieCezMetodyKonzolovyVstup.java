package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZakladneMatematickeOperacieCezMetodyKonzolovyVstup {
    public static double scitanie(double cislo1, double cislo2) {
        double sucet = cislo1 + cislo2;
        return sucet;
        // alebo takto v skratenom tvare return cislo1 + cislo2;
    }

    public static double odcitanie(double cislo1, double cislo2) {
        double odcitanie = cislo1 - cislo2;
        return odcitanie;
    }

    public static double nasobenie(double cislo1, double cislo2) {
        double nasobenie = cislo1 * cislo2;
        return nasobenie;
    }

    public static double delenie(double cislo1, double cislo2) {
        double delenie = cislo1 / cislo2;
        return delenie;
    }

    public static double modulo(double cislo1, double cislo2) {
        double modulo = cislo1 % cislo2;
        return modulo;
    }

    public static void vypis(String operacia, double cislo1, double cislo2, double vysledok) {
        System.out.printf("%s 2 cisel %.1f a %.1f je: %.1f%n", operacia, cislo1, cislo2, vysledok);
    }

    public static void main(String[] args) {
        double cislo1 = 0, cislo2 = 0;
        Scanner skener = new Scanner(System.in);
        System.out.println("Zadaj prvé číslo: ");
        try {
            cislo1 = skener.nextDouble();
        } catch (InputMismatchException e) {
            System.exit(1);
        } finally {
            skener.close();
        }
        System.out.println("Zadaj druhé číslo: ");
        cislo2 = skener.nextDouble();

        vypis("Sucet :", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Ddcitanie :", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Nasobenie :", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Delenie :", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo :", cislo1, cislo2, modulo(cislo1, cislo2));

    }
}
