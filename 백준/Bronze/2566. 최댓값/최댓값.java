import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[9][9];

		int resultValue = 0;
		int row = 1;
		int column = 1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int boardValue = sc.nextInt();
				board[i][j] = boardValue;
				if (boardValue <= resultValue) {
					continue;
				}

				resultValue = boardValue;
				row = i + 1;
				column = j + 1;
			}
			sc.nextLine();
		}

		System.out.println(resultValue);
		System.out.println(row + " " + column);
	}
}