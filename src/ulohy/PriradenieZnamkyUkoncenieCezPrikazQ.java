package ulohy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PriradenieZnamkyUkoncenieCezPrikazQ {
    public static void main(String[] args) {

        while (true){  //nekonecny cyklus, ako aj for(;;)
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj počet bodov: ");
            String pocetBodov = skener.nextLine();

            // 1.sposob ako ukoncit while v pisanom q
            if (pocetBodov.equals("q")) break;

            int pocetBodovAkoInt = Integer.parseInt(pocetBodov);
            if (Integer.parseInt(pocetBodov) > 90) System.out.println("Tvoja znamkja je A");
            else if (Integer.parseInt(pocetBodov) > 75) System.out.println("Tvoja znamkja je B");
            else if (Integer.parseInt(pocetBodov) > 65) System.out.println("Tvoja znamkja je C");
            else System.out.println("Neviem priradit znamku");
        }
    }
}
