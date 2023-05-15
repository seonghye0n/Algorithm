
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(reader.readLine());

		List<String> list = new ArrayList<>();

		for (int i = 0; i < cnt; i++) {
			list.add(reader.readLine());
		}

		reader.close();

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int x1 = Integer.parseInt(o1.split(" ")[0]);
				int x2 = Integer.parseInt(o2.split(" ")[0]);
				int y1 = Integer.parseInt(o1.split(" ")[1]);
				int y2 = Integer.parseInt(o2.split(" ")[1]);

				int returnValue = x1 - x2;

				if (returnValue == 0) {
					return y1 - y2;
				}

				return returnValue;
			}
		});

		list.stream().forEach(System.out::println);
	}
}
