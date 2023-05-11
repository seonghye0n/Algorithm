
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			int value = sc.nextInt();

			if (value == 0) {
				stack.pop();
				continue;
			}

			stack.push(value);
		}

		int answer = 0;

		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}

		System.out.println(answer);
	}
}
