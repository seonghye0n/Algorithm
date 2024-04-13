import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.replace("c=", "a");
		str = str.replace("c-", "a");
		str = str.replace("dz=", "a");
		str = str.replace("d-", "a");
		str = str.replace("lj", "a");
		str = str.replace("nj", "a");
		str = str.replace("s=", "a");
		str = str.replace("z=", "a");

		System.out.println(str.length());
	}
}
