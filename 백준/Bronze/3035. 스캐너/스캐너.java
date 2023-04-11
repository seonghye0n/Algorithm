
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrays = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        String[] textList = new String[arrays[0]];

        sc.nextLine();

        for (int i = 0; i < arrays[0]; i++) {
            textList[i] = sc.nextLine();
        }

        for (int i = 0; i < arrays[0]; i++) {
            for (int j = 0; j < arrays[2]; j++) {
                for (int k = 0; k < textList[i].length(); k++) {
                    for (int l = 0; l < arrays[3]; l++) {
                        System.out.print(textList[i].charAt(k));
                    }
                }
                System.out.println();
            }
        }
    }
}
