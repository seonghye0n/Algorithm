import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int answer = 0;
        int cnt = 1;

        while(true) {
            if (num < cnt) {
                cnt = 1;
            }
            num -= cnt;

            answer++;
            cnt++;

            if (num == 0) break;
        }

        System.out.println(answer);
    }
}