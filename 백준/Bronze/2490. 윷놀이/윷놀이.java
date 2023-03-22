import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yut = null;

        for (int i = 1; i <= 3; i++) {
            int yut1 = sc.nextInt();
            int yut2 = sc.nextInt();
            int yut3 = sc.nextInt();
            int yut4 = sc.nextInt();

            switch (yut1 + yut2 + yut3 + yut4) {
                case 0:
                    yut = "D";
                    break;

                case 1:
                    yut = "C";
                    break;

                case 2:
                    yut = "B";
                    break;

                case 3:
                    yut = "A";
                    break;

                case 4:
                    yut = "E";
                    break;
            }
            System.out.println(yut);
        }
    }
}
