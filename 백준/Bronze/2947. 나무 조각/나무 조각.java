
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[5];

        int cnt = 0;
        int swap = 0;

        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();
        }

        sc.close();

        while(true) {
            if (list[0] == 1 && list[1] == 2 && list[2] == 3 && list[3] == 4 && list[4] == 5) break;

            if (cnt == 4) cnt = 0;

            if (list[cnt] > list[cnt+1]) {
                swap = list[cnt];

                list[cnt] = list[cnt+1];
                list[cnt+1] = swap;

                for(int i = 0; i < 5; i++) {
                    System.out.print(list[i] + " ");
                }
                System.out.println();
            }

            cnt++;
        }
    }
}
