
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		int[][] arr = new int[cnt][2];

		for (int i = 0; i < cnt; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1])
				return o1[0] - o2[0];

			return o1[1] - o2[1];
		});

		int ans = 0;
		int time = 0;

		for (int i = 0; i < cnt; i++) {
			if (arr[i][0] >= time) {
				time = arr[i][1];
				ans++;
			}
		}

		System.out.println(ans);
	}
}
