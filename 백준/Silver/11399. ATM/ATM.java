
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int ans = 0;
		int prev = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += prev + arr[i];
			prev += arr[i];
		}
		System.out.println(ans);
	}
}
