import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int loopCnt = Integer.parseInt(sc.nextLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < loopCnt; i++) {
			String command = sc.nextLine();

			if (command.contains("1")) {
				stack.push(Integer.parseInt(command.substring(2)));
				continue;
			}

			char c = command.charAt(0);
			switch (c) {
				//case 1의 경우 query.substring(2);를 한 이유는 공백도 문자로 포함하기 때문이다 1 X 형태이기 때문에 X의인덱스는 2다.
				case '1':
					stack.push(Integer.parseInt(command.substring(2)));
					break;
				case '2':
					sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
					break;
				case '3':
					sb.append(stack.size()).append("\n");
					break;
				case '4':
					sb.append(stack.isEmpty() ? 1 : 0).append("\n");
					break;
				case '5':
					sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
					break;
				default:
					break;
			}
		}

		System.out.println(sb);
	}
}