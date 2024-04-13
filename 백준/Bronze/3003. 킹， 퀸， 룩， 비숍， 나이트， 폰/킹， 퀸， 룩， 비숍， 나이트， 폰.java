import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] chessQuantities = new int[] {1, 1, 2, 2, 2, 8};

		int[] inputChessQuantities = new int[6];
		for (int i = 0; i < inputChessQuantities.length; i++) {
			inputChessQuantities[i] = sc.nextInt();
		}
		sc.nextLine();

		for (int i = 0; i < 6; i++) {
			System.out.printf(chessQuantities[i] - inputChessQuantities[i] + " ");
		}
	}
}