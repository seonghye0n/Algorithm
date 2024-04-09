import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loopCnt = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < loopCnt; i++) {
			String str = sc.nextLine();

			System.out.println(str.substring(0, 1) + str.substring(str.length() - 1));
		}
	}
}