package Practice;

public class Durchschnittstemperatur {
    public static void main(String[] args) {
        int[] temperaturen = {18, 47, 98, 22, 19, 25, 21};

        double answer =  sumOfArray(temperaturen);
        String formatted = String.format("%.2f", answer);  // 2 Dezimalstellen

        System.out.println(formatted);
    }

    static double sumOfArray(int[] value) {
        int sum = 0;

        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        return (double) sum / value.length;
    }

 /*   public class Durchschnittstemperatur {
        public static void main(String[] args) {
            int[] temperaturen = {18, 22, 19, 25, 21};

            int summe = sumOfArray(temperaturen);
            int anzahl = countTheIndex(temperaturen);
            int durchschnitt = durchschnitt(temperaturen);

            System.out.println("Summe: " + summe);
            System.out.println("Anzahl: " + anzahl);
            System.out.println("Durchschnitt: " + durchschnitt);
        }

        static int sumOfArray(int[] value) {
            int sum = 0;

            for (int i = 0; i < value.length; i++) {
                sum += value[i];
            }
            return sum;
        }

        static int countTheIndex(int[] array) {
            return array.length;
        }

        static int durchschnitt(int[] value) {
            return sumOfArray(value)/ countTheIndex(value);
        }
    } */

}
