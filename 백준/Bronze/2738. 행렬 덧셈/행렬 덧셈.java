import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();

		int[][] arrayA = new int[N][M];
		int[][] arrayB = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arrayA[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arrayB[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}

		for (int i = 0; i < N; i++) {
			int result = 0;

			for (int j = 0; j < M; j++) {
				result += arrayA[i][j];
				result += arrayB[i][j];

				System.out.print(result + " ");
				result = 0;
			}
			System.out.println();
		}
	}
}