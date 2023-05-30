
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[8];

		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}

		boolean ascYn = false;
		boolean descYn = false;
		String answer = "";
		for (int i = 0; i < 8; i++) {
			if (i == 0)
				continue;

			if (arr[i - 1] > arr[i])
				descYn = true;

			if (arr[i - 1] < arr[i])
				ascYn = true;
		}

		if ((ascYn && descYn) || (!ascYn && !descYn)) {
			System.out.println("mixed");
		} else if (ascYn) {
			System.out.println("ascending");
		} else if (descYn) {
			System.out.println("descending");
		}
	}
}
