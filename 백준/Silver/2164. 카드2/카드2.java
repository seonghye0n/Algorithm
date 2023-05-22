
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int cards = Integer.parseInt(reader.readLine());
		LinkedList<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= cards; i++) {
			queue.add(i);
		}

		while (queue.size() > 1) {
			queue.pop();

			int popcard = queue.pop();
			queue.add(popcard);
		}

		System.out.println(queue.peek());
	}
}
