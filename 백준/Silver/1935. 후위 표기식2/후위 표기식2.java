
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String str = sc.nextLine();

		double[] arr = new double[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(sc.nextLine());
		}

		Stack<Double> stack = new Stack<>();

		double result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				stack.push(arr[str.charAt(i) - 'A']);
			} else {
				if (!stack.isEmpty()) {
					double first = stack.pop();
					double second = stack.pop();

					switch (str.charAt(i)) {
						case '+':
							result = second + first;
							stack.push(result);
							break;

						case '-':
							result = second - first;
							stack.push(result);
							break;

						case '*':
							result = second * first;
							stack.push(result);
							break;

						case '/':
							result = second / first;
							stack.push(result);
							break;
					}
				}
			}
		}

		System.out.printf("%.2f", stack.pop());
	}
}
