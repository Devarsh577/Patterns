import java.util.Scanner;

public class Pattern11 {

    public static void main(String args[]) {

        int i, j, rows;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {

            for (j = 1; j <= rows*2-1; j++) {

                if (j >= i && j <= rows*2 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

    }
}
