
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt * 2; j++) {
                if (j <= i) {
                    System.out.print('*');
                } else if (j >= cnt * 2 - i -1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = cnt - 1; i >= 0; i--) {
            for (int j = 0; j < cnt * 2; j++) {
                if (j < i) {
                    System.out.print('*');
                } else if (j > cnt * 2 - i -1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
