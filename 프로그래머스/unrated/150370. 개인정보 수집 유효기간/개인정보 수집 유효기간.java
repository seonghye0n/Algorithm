import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answerList = new ArrayList<>();
		StringTokenizer todayTokenizer = new StringTokenizer(today, ".");
		int year = Integer.parseInt(todayTokenizer.nextToken());
		int month = Integer.parseInt(todayTokenizer.nextToken());
		int day = Integer.parseInt(todayTokenizer.nextToken());

		int todayInt = (year * 12 * 28) + (month * 28) + day;

		Map<String, Integer> termMap = new HashMap<>();

		for (String term : terms) {
			StringTokenizer tokenizer = new StringTokenizer(term);
			termMap.put(tokenizer.nextToken(), Integer.parseInt(tokenizer.nextToken()));
		}

		int index = 1;
		for (String privacy : privacies) {
			StringTokenizer privacyTokenizer = new StringTokenizer(privacy.split(" ")[0], ".");
			int privacyYear = Integer.parseInt(privacyTokenizer.nextToken());
			int privacyMonth = Integer.parseInt(privacyTokenizer.nextToken());
			int privacyDay = Integer.parseInt(privacyTokenizer.nextToken());

			privacyMonth += termMap.get(privacy.split(" ")[1]);

			int privacyInt = (privacyYear * 12 * 28) + (privacyMonth * 28) + privacyDay;

			if (privacyInt <= todayInt) {
				answerList.add(index);
			}

			index++;
		}

		int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
		return answer;
    }
}