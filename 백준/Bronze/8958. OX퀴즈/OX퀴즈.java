
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < cnt; i++) {
            String text = sc.nextLine();

            int bonusCnt = 0;
            int sum = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == 'O') {
                    bonusCnt++;
                } else {
                    bonusCnt = 0;
                }

                sum += bonusCnt;
            }

            System.out.println(sum);
        }
    }
}
