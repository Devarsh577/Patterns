import java.util.Scanner;

public class Pattern10 {

    public static void main(String args[]) {

        int i, j, k = 0, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {

            if (rows % 2 == 0) {

                if (i <= rows / 2) {
                    k++;
                }
                if (i > rows / 2 + 1)

                    if (i <= (rows + 1) / 2) {
                        k++;
                    } else {
                        k--;
                    }
                for (j = 1; j <= (rows + 1) / 2; j++) {
                    if (j <= k) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println("");
            }
        }
    }

}
