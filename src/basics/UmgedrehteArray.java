package basics;

public class UmgedrehteArray {
    public static int[] dreheArrayUm(int[] zahlen) {
        int left , right, temp;
        left = 0;
        right = zahlen.length -1;

        while (left < right){
            temp = zahlen[left];
            zahlen[left] =zahlen[right];
            zahlen[right] = temp;

            left++;
            right--;
        }

        return zahlen;
    }
    static void main() {
        int[] zahlen = {1, 2, 3, 4, 5};
        int[] umgedreht = dreheArrayUm(zahlen);

        for (int i = 0; i < umgedreht.length; i++) {
            System.out.print(umgedreht[i] +  " ");
        }

    }
}
