
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int answer = 0;

		for (int i = 0; i < 5; i++) {
			int value = sc.nextInt();

			if (value < 0 || value > 100) throw new Exception();

			answer += value;
		}

		System.out.println(answer);
	}
}
