import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
		Stack<Integer> result = new Stack<>();
		result.push(0);
		int answer = 0;

		for (int move : moves) {
			int number = getNumber(board, move);

			if (number == 0)
				continue;

			if (!result.peek().equals(number)) {
				result.push(number);
				continue;
			}

			result.pop();
			answer += 2;
		}

		return answer;
    }
    
    public int getNumber(int[][] board, int move) {
		for (int i = 0; i < board.length; i++) {
			int doll = board[i][move - 1];

			if (doll == 0)
				continue;

			board[i][move - 1] = 0;

			return doll;
		}

		return 0;
	}
}