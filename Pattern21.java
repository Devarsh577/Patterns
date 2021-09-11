public class Pattern21 {

    public static void main(String a[]) {

        int i, j, k;
        ;
        for (i = 1; i <= 6; i++) {
            k = 1;
            for (j = 1; j <= 6; j++) {
                if (j <= i) {
                    System.out.print(k);
                    k = 1 - k;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
