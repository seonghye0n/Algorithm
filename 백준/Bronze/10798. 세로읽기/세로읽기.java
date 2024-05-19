import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] board = new char[5][15];

		for (int i = 0; i < 5; i++) {
			String input = sc.nextLine();

			for (int j = 0; j < input.length(); j++) {
				board[i][j] = input.charAt(j);
			}
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (board[j][i] == 0) {
					continue;
				}
				result.append(board[j][i]);
			}
		}

		System.out.println(result);
	}
}