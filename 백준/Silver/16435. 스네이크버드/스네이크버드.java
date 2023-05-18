
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int fruitCnt = sc.nextInt();
		int snakeBird = sc.nextInt();
		int[] arr = new int[fruitCnt];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (snakeBird >= arr[i])
				snakeBird++;
		}

		System.out.println(snakeBird);
	}
}
