       package ulohy;
/*
Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.
*/

 import java.sql.SQLOutput;
 import java.util.InputMismatchException;
 import java.util.Scanner;

       public class PriradenieZnamky {
    public static void main(String[] args) {
        int pocetBodov = 0; //inicializacia premennej na tomto mieste aby sme ju mali platnu v celom rozsahu bloku
        Scanner skener = new Scanner(System.in); //inicializuje skenera pre pouzivatelsky vstup
        while(pocetBodov >= 0) {
        System.out.println("Zadaj pocet bodov: ");
        try {
            pocetBodov = skener.nextInt();
            if (pocetBodov > 90) System.out.println("Tvoja znamka je A");
            else if (pocetBodov > 75) System.out.println("Tvoja znamka je B");
            else if (pocetBodov > 65) System.out.println("Tvoja znamka je C");
            //else if (pocetBodov == -1) System.exit(1);
            else System.out.println("Počtu bodov nezodpoveda ziadna stranka");
            } catch (InputMismatchException e) {
            System.out.println("Prepáč, zadal si nesprávny formát cisla");
            System.exit(1);

        }

        }
        skener.close();
    }

}
