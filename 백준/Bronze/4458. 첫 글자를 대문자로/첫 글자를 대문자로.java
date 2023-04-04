import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cnt; i++) {
            String text = sc.nextLine();
            String upperText = text.substring(0, 1).toUpperCase();

            text = upperText + text.substring(1);

            System.out.println(text);
        }
    }
}