import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loopCnt = sc.nextInt();

        for (int i = 1; i <= loopCnt; i++) {
            int loop = sc.nextInt();
            String str = sc.next();
            String answer = "";

            for (int j = 0; j < str.length(); j++) {
                for (int k = 1; k <= loop; k++) {
                    answer += str.charAt(j);
                }
            }

            System.out.println(answer);
        }
    }
}