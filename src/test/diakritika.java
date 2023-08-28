import java.text.Normalizer;
import java.util.regex.Pattern;
import java.util.Scanner;

public class diakritika {

    public static String removeDiacritics(String text) {
        String normalizedText = Normalizer.normalize(text, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizedText).replaceAll("");
    }


    public static void main(String[] args) {
        /*String input = "Toto je nejaký text s diakritikou: áččšž";
        String normalized = removeDiacritics(input);
        System.out.println("Original: " + input);
        System.out.println("Normalized: " + normalized);*/

        Scanner scn = new Scanner(System.in);
        while (true) {
                System.out.println("Zadaj svoju znamku slovne: ");
                String znamka = scn.nextLine();
                znamka = removeDiacritics(znamka);
                if (znamka.equals("vyborny")) System.out.println("Vaša známka je: 1");
                else if (znamka.equals("chvalitebny")) System.out.println("Vaša známka je: 2");
                else if (znamka.equals("dobry")) System.out.println("Vaša známka je: 3");
                else if (znamka.equals("dostatocny")) System.out.println("Vaša známka je: 4");
                else if (znamka.equals("nedostatocny")) System.out.println("Vaša známka je: 5");
                else if (znamka.equals("exit")) break;
                else System.out.println("Zadal si nesprávne slovne uvedenú znamku. Zadaj ju prosím znova, alebo ak chceš ukončit program napíš 'Exit'. ");

            }


        }

    }
/*/
