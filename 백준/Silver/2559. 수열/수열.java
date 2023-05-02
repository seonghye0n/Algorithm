
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int sumDays = sc.nextInt();
        int[] arr = new int[days];
        int val = 0;
        int answer = Integer.MIN_VALUE;

        sc.nextLine();

        for (int i = 0; i < days; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < days; i++) {
            if (i + sumDays > days) break;
            val = arr[i];
            for (int j = i + 1; j < i + sumDays; j++) {
                val += arr[j];
            }

            answer = answer > val? answer : val;
        }

        System.out.println(answer);
    }
}
