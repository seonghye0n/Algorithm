
import java.util.Scanner;

public class Main {
    static int[] stack;
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        stack = new int[sc.nextInt()];

        for (int i = 0; i < stack.length; i++) {
            String command = sc.next();

            if (command.contains("push")) {
                push(sc.nextInt());
                continue;
            }

            if (command.equals("pop")) {
                sb.append(pop() + "\n");
                continue;
            }

            if (command.equals("size")) {
                sb.append(size() + "\n");
                continue;
            }

            if (command.equals("empty")) {
                sb.append(empty() + "\n");
                continue;
            }

            if (command.equals("top")) {
                sb.append(top() + "\n");
            }
        }

        System.out.println(sb);
    }

    public static void push(int value) {
        stack[size] = value;
        size++;
    }

    public static int pop() {
        if (empty() == 1) return -1;

        int oldValue = stack[size-1];

        stack[size-1] = 0;
        size--;

        return oldValue;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        return size == 0 ? 1 : 0;
    }

    public static int top() {
        if (empty() == 1) return -1;

        return stack[size-1];
    }
}
