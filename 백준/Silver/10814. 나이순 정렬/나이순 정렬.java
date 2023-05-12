
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		String[][] list = new String[cnt][2];

		for (int i = 0; i < cnt; i++) {
			list[i][0] = sc.next();
			list[i][1] = sc.next();
		}

		Arrays.sort(list, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});

		for (int i = 0; i < cnt; i++) {
			System.out.println(list[i][0] + " " + list[i][1]);
		}
	}
}
