import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[100][100];

		int loopCnt = Integer.parseInt(sc.nextLine());

		int result = 0;
		for (int i = 0; i < loopCnt; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (array[x + j][y + k] == 1)
						continue;

					array[x + j][y + k] = 1;
					result++;
				}
			}
		}

		System.out.println(result);
	}
}