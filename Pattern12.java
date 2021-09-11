public class Pattern12 {

    public static void main(String args[]) {

        int i, j, k;

        for (i = 1; i <= 4; i++) {
            k = i -1;
            for (j = 1; j <= 7; j++) {

                if (j >= 5 - i && j <= 3 + i) {

                    if (j <=4) {
                        k++;
                    } else {
                        k--;
                    }
                    // (j <= 4) ? k++ : k--;

                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
