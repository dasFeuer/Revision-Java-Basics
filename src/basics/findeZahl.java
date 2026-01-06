package basics;

public class findeZahl {
    public static int findeGroessteZahl(int[] zahlen) {
        int max = zahlen[0];
        for (int j : zahlen) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int findeKleinsteZahl(int[] zahlen) {
        int min = zahlen[0];
        for (int i = 0; i < zahlen.length; i++) {
            if (min > zahlen[i]){
                min = zahlen[i];
            }
        }
        return min;

    }
    static void main(String[] args) {
        int[] zahlen = {5, 2, 9, 1, 7, 99};
        int max = findeGroessteZahl(zahlen);
        System.out.println(max);

        int[] negative = {-5, -2, -9, -1};
        System.out.println(findeGroessteZahl(negative));

        int min = findeKleinsteZahl(zahlen);
        System.out.println(min);
    }
}
