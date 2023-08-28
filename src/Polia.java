public class Polia {
    public static int spocitaj (int[] cisla){
        int sucet = 0;
        for (int i = 0; i < cisla.length; i++) {
            sucet = sucet + cisla[i];
        }
        return sucet;
    }

    public static double priemeruj (int[] cisla){
        int sucet = 0;
        int pocetCisel  = 0;
        for (int i = 0; i < cisla.length; i++) {
            pocetCisel= pocetCisel + 1;
            sucet = sucet + cisla[i];
        }
        double priemer = (double) sucet / pocetCisel;
        return priemer;
    }

    public static int pocetCiselaMax (int[] cisla) {
        int maxCislo = cisla[0];
        int pocetCisel = 0;
        for (int i = 0; i < cisla.length; i++) {
            pocetCisel = pocetCisel + 1;
            if (cisla[i] > maxCislo) {
                maxCislo = cisla[i];
            }
        }
        System.out.println("Počet čísiel v poli je: " + pocetCisel);
        return maxCislo;
    }

    public static void main(String[] args) {
        int[] poleCisiel = {4, 5, 9, 12, 6};
        int sucet = spocitaj(poleCisiel);
        double priemer = priemeruj(poleCisiel);
        int maxCislo = pocetCiselaMax(poleCisiel);
        //int pocetCisel = pocetCiselaMax(poleCisiel);
        System.out.println("Súčet vsetkych cisel v poli je: " + sucet);
        System.out.println("Priemer vsetkych cisel v poli je: " + priemer);
        System.out.println("Maximálne cislo v poli je: " + maxCislo);
    }
}

