/*
Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.
        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.
        Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?
        Pomôcka:
// Ako naformatovat cislo v SK formate na 2 desatinne miesta, pouzijeme %.2f
        System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneCislo);
        Bonusová úloha č.2: Vytvoriť konkrétne matematické operácie cez metódy.
        Bonusová úloha č.3: Vstup hodnôt by mohol byť cez konzolu, čiže Scanner.
*/


package ulohy;

import java.sql.SQLOutput;

public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
        double cislo1 = 2.3;
        double cislo2 = 4.5;
        double scitanie = cislo1 + cislo2;
        double odcitanie = cislo1 - cislo2;
        double nasobenie = cislo1 * cislo2;
        double delenie = cislo1 / cislo2;
        double modulo = cislo1 % cislo2;

        System.out.println("Výsledkom sčítanie hodnôt " + cislo1 + " a "  + cislo1 + "je " + scitanie);
        System.out.printf("Výsledkom sčítania hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, scitanie);
        System.out.printf("Výsledkom odcitania hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, odcitanie);
        System.out.printf("Výsledkom nasobenia hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, nasobenie);
        System.out.printf("Výsledkom delenia hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, delenie);
        System.out.printf("Výsledkom modulo hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, modulo);

    }

}
