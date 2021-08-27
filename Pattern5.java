public class Pattern5 {

    public static void main(String args[]) {

        int i, j;
        boolean k = true;

        for (i = 0; i <= 5; i++) {

            for (j = 0; j <= 9; j++) {

                if (j >= 6 - i && j <= 4 + i && k) {

                    System.out.print("*");
                    k = false;

                } else {

                    System.out.print(" ");
                    k = true;

                }
            }

            System.out.println(" ");
        }
    }

}
