import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
		long queueSum1 = Arrays.stream(queue1).sum();
		long queueSum2 = Arrays.stream(queue2).sum();
		long sum = queueSum1 + queueSum2;

		if (sum % 2 == 1)
			return -1;

		sum /= 2;

		Queue<Integer> realQueue1 = arrayToQueue(queue1);
		Queue<Integer> realQueue2 = arrayToQueue(queue2);

		int maxCount = (realQueue1.size() + realQueue2.size()) * 2;
		int cnt = 0;

		while (cnt != maxCount) {
			if (queueSum1 == sum && queueSum2 == sum)
				return cnt;

			if (queueSum1 > queueSum2) {
				int temp = realQueue1.poll();
				realQueue2.add(temp);
				queueSum1 -= temp;
				queueSum2 += temp;
			} else {
				int temp = realQueue2.poll();
				realQueue1.add(temp);
				queueSum1 += temp;
				queueSum2 -= temp;
			}

			cnt++;
		}

		return -1;
    }
    
    public Queue<Integer> arrayToQueue(int[] arr) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
		}

		return queue;
	}
}