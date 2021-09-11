public class Pattern14 {

    public static void main(String args[]) {

        int i, j, k = 0, p;

        for (i = 1; i <= 9; i++) {

            if (i < 6) {
                k++;
            } else {
                k--;
            }

            p = 1;
            for (j = 1; j <= 6; j++) {

                if (j >= 6 - k) {
                    System.out.print(p);
                    p++;

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
