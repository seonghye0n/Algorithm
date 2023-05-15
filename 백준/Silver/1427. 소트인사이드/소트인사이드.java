
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String number = sc.next();

		List<Integer> numberList = new ArrayList<>();

		for (int i = 0; i < number.length(); i++) {
			numberList.add(Integer.parseInt(String.valueOf(number.charAt(i))));
		}

		Collections.sort(numberList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

		numberList.stream().forEach(s-> System.out.print(s));
	}
}
