
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < cnt; i++) {
            int num = sc.nextInt();

            if (max < num) max = num;

            if (min > num) min = num;

        }

        System.out.println(min + " " + max);
    }
}
