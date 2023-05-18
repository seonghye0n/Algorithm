
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					int cardSum = arr[i] + arr[j] + arr[k];

					if (cardSum > M)
						continue;

					int minus = Math.abs(cardSum - M);

					if (min < minus)
						continue;

					min = minus;
					sum = cardSum;
				}
			}
		}

		System.out.println(sum);
	}
}
