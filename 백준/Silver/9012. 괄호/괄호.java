
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void foo(String s) {
        Stack<Character> stack = new Stack<>();

        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.size() < 1) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.size() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int cnt = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < cnt; i++) {
            String text = sc.nextLine();

            foo(text);
        }
    }
}
