
public class Pattern15 {

    public static void main(String args[]) {
        int i, j;
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7; j++) {
                if (j == i || j == 8 - i) {

                    if (i == 8 - j) {
                        System.out.print("/");
                    } else {
                        System.out.print("\\");
                    }

                    System.out.print("");
                } else {

                    System.out.print("*");

                }
            }
            System.out.println(" ");
        }
    }

}
