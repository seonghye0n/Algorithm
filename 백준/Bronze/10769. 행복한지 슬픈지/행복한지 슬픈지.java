
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int happyCnt = (input.length() - input.replace(":-)", "").length()) / 3;
        int sadCnt = (input.length() - input.replace(":-(", "").length()) / 3;

        String result = "";
        if (happyCnt + sadCnt == 0) {
            result = "none";
        } else if (happyCnt == sadCnt) {
            result = "unsure";
        } else if (happyCnt > sadCnt) {
            result = "happy";
        } else if (happyCnt < sadCnt) {
            result = "sad";
        }

        System.out.println(result);
    }
}
