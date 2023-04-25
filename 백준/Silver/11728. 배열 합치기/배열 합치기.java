
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < M; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        list.stream().forEach(s->sb.append(s + "\n"));
        System.out.println(sb);
    }
}
