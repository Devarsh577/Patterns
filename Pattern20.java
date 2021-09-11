public class Pattern20 {

    public static void main(String a[]) {

        int i, j;
        char k;

        for (i = 1; i <= 4; i++) {
            k = '1';

            for (j = 1; j <= 7; j++) {

                if (j == 5) {
                    k = 'A';
                }

                if (j >= 5 - i && j <= 3 + i) {

                    System.out.print(k);
                    k++;

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
