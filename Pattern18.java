
public class Pattern18 {

    public static void main(String args[]) {

        int i, j;
        char k;
        for (i = 1; i <= 4; i++) {
            k = 'A';

            for (j = 1; j <= 8; j++) {

                if (j == 5) {
                    k = '1';
                }

                if (j >= 5 - i && j <= 3 + i) {

                    System.out.print(k);
                    k++;

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
