import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = Integer.parseInt(sc.nextLine());

		System.out.println(s.substring(i - 1, i));
	}
}