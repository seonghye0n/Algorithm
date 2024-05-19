import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		int B = sc.nextInt();

		int tmp = 1;
		int result = 0;

		for (int i = N.length() - 1; i >= 0; i--) {
			char C = N.charAt(i);

			if ('A' <= C && C <= 'Z') {
				result += (C - 'A' + 10) * tmp;
			} else {
				result += (C - '0') * tmp;
			}
			tmp *= B;
		}

		System.out.println(result);
	}
}
