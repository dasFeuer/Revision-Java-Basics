package basics;



public class AddArray {

    public static int berechnesumme(int[] zahlen) {
        int summe = 0;

        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        return summe;
    }
    static void main() {
        int[] test1 = {1, 2, 3, 4, 5};
        System.out.println("Summe: " + berechnesumme(test1));

        int[] test2 = {10, 20, 30};
        System.out.println("Summe: " + berechnesumme(test2));
    }
}
