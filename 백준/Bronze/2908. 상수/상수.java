import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str1 = new StringBuilder(sc.next()).reverse().toString();
        String str2 = new StringBuilder(sc.next()).reverse().toString();

        System.out.println(str1.compareTo(str2) > 0 ? str1 : str2);
    }
}