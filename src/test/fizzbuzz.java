package test;

public class fizzbuzz {

        public static void main(String[] args) {

            String[] cisla = new String[30];
            String fizz = "fizz";
            String fazz = "fazz";

            for (int i = 0; i < cisla.length; i++) {
                cisla[i] = String.valueOf(i + 1);
                int deleno3 = (i + 1) % 3;
                int deleno5 = (i + 1) % 5;

                if (deleno3 == 0) {
                    cisla[i] = fizz;
                } else if (deleno5 == 0) {
                    cisla[i] = fazz;
                }

                System.out.print(cisla[i] + " ");
            }
        }
    }


