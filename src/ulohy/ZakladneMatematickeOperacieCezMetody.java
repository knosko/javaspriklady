package ulohy;

public class ZakladneMatematickeOperacieCezMetody {
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
        double cislo1 = 8, cislo2 = 2.5;
/*        //scitanie(cislo1, cislo2);
        //System.out.println("Sucet 2 cisel: " + scitanie(cislo1, cislo2));
        System.out.printf("Súčet 2 cisel %.1f a %.1f je %.1f%n", cislo1, cislo2, scitanie(cislo1, cislo2));
        System.out.printf("Odcitanie 2 cisel %.1f a %.1f je %.1f%n", cislo1, cislo2, odcitanie(cislo1, cislo2));
        System.out.printf("Nasobenie 2 cisel %.1f a %.1f je %.1f%n", cislo1, cislo2, nasobenie(cislo1, cislo2));
        System.out.printf("Delenie 2 cisel %.1f a %.1f je %.1f%n", cislo1, cislo2, delenie(cislo1, cislo2));
        System.out.printf("Modulo 2 cisel %.1f a %.1f je %.1f%n", cislo1, cislo2, modulo(cislo1, cislo2));*/

        vypis("Sucet :", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Ddcitanie :", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Nasobenie :", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Delenie :", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo :", cislo1, cislo2, modulo(cislo1, cislo2));

    }
}
