
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(reader.readLine());

		Deque<Integer> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cnt; i++) {
			String command = reader.readLine();

			if (command.equals("size")) {
				sb.append(deque.size()).append("\n");
				continue;
			}

			if (command.equals("empty")) {
				sb.append(deque.isEmpty() ? 1 : 0).append("\n");
				continue;
			}

			if (command.equals("front")) {
				if (deque.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque.getFirst()).append("\n");
				}
				continue;
			}

			if (command.equals("back")) {
				if (deque.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque.getLast()).append("\n");
				}
				continue;
			}

			if (command.equals("pop_front")) {
				if (deque.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque.pollFirst()).append("\n");
				}

				continue;
			}

			if (command.equals("pop_back")) {
				if (deque.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque.pollLast()).append("\n");
				}
			}

			if (command.contains("push_front")) {
				int value = Integer.parseInt(command.split(" ")[1]);

				deque.addFirst(value);
				continue;
			}

			if (command.contains("push_back")) {
				int value = Integer.parseInt(command.split(" ")[1]);

				deque.addLast(value);
			}
		}

		System.out.println(sb);
	}
}
