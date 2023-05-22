
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int cnt = Integer.parseInt(reader.readLine());
		LinkedList<Integer> queue = new LinkedList<>();

		for (int i = 0; i < cnt; i++) {
			String command = reader.readLine();

			if (command.equals("size")) {
				sb.append(queue.size()).append("\n");
				continue;
			}

			if (command.equals("front")) {
				sb.append(queue.peek() == null ? -1 : queue.peek()).append("\n");
				continue;
			}

			if (command.equals("back")) {
				sb.append(queue.peekLast() == null ? -1 : queue.peekLast()).append("\n");
				continue;
			}

			if (command.equals("empty")) {
				sb.append(queue.isEmpty() ? 1 : 0).append("\n");
				continue;
			}

			if (command.contains("push")) {
				queue.add(Integer.parseInt(command.split(" ")[1]));
				continue;
			}

			if (command.equals("pop")) {
				if (queue.isEmpty()) {
					sb.append("-1");
				} else {
					sb.append(queue.pop());
				}

				sb.append("\n");
			}
		}

		System.out.println(sb);
	}
}
