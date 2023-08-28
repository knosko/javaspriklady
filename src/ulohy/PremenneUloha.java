package ulohy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PremenneUloha {

    private static LocalDate LocaDate;

    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";

        LocalDate datumNarodenia = LocalDate.of(2000, 4, 3);
        System.out.println(datumNarodenia);
        DateTimeFormatter dtfNarodenie = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate1 = datumNarodenia.format(dtfNarodenie);

        float znamka = 1.5f;

        int datumNastupu = 2022;

        LocalDate aktualnyDatum = LocaDate.now();
        System.out.println(aktualnyDatum);
        DateTimeFormatter dtfAktual = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate3 = aktualnyDatum.format(dtfAktual);


        System.out.println("Študent Jozef Mrkvička sa narodil " + datumNarodenia + ", z maturitnej skúšky má známku " + znamka + " a od " + datumNastupu + " nastúpi do nového zamestnania ako Java programátor. \nV Bratislave dňa "+aktualnyDatum);

    }

}
