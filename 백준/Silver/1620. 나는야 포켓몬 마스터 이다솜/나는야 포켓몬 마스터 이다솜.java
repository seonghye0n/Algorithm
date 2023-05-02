
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int problemCnt = sc.nextInt();
        HashMap<String, Integer> pocketmonMap =  new HashMap<>();
        String[] nameList = new String[cnt + 1];

        sc.nextLine();

        for (int i = 1; i <= cnt; i++) {
            String pocketmon = sc.nextLine();
            pocketmonMap.put(pocketmon, i);
            nameList[i] = pocketmon;
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < problemCnt; i++) {
            String problem = sc.nextLine();
            if (isNumeric(problem)) {
                answer.append(nameList[Integer.parseInt(problem)] + "\n");
            } else {
                answer.append(pocketmonMap.get(problem) + "\n");
            }
        }

        System.out.println(answer);
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
