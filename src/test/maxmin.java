package test;

import java.util.Arrays;

public class maxmin {
    public static int[] minmax(int[] poleCisiel) {
        Arrays.sort(poleCisiel);
        int minCislo = poleCisiel[0];
        int maxCislo = poleCisiel[poleCisiel.length - 1];
        return new int[]{minCislo, maxCislo};
    }

    public static void main(String[] args) {
        int[] pole = {4, 5, 9, 12, 6};
        int[] minMax = minmax(pole);
        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }
}