
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = Integer.parseInt(sc.nextLine());

		int result = 0;

		for (int i = 0; i < cnt; i++) {
			String str = sc.nextLine();

			if (checks(str)) {
				result++;
			}
		}

		System.out.println(result);
	}

	static boolean checks(String str) {
		boolean[] alphabetArr = new boolean[26];
		int prev = -1;

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (alphabetArr[now - 97] == false) {
					alphabetArr[now - 97] = true;

					prev = now;
				} else {
					return false;
				}
			}
		}

		return true;
	}
}
