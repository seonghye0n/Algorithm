import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
		Map<String, Integer> map = new HashMap<>();

		int[] point = new int[] {3, 2, 1, 0, 1, 2, 3};

		for (int i = 0; i < choices.length; i++) {
			String startKey = Character.toString(survey[i].charAt(0));
			String endKey = Character.toString(survey[i].charAt(1));

			if (!map.containsKey(startKey)) {
				map.put(startKey, 0);
			}

			if (!map.containsKey(endKey)) {
				map.put(endKey, 0);
			}

			if (choices[i] < 4) {
				map.replace(startKey, map.get(startKey) + point[choices[i] - 1]);
			} else if (choices[i] > 4) {
				map.replace(endKey, map.get(endKey) + point[choices[i] - 1]);
			}
		}

		sb.append(map.getOrDefault("R", 0) < map.getOrDefault("T", 0) ? "T" : "R");
		sb.append(map.getOrDefault("C", 0) < map.getOrDefault("F", 0) ? "F" : "C");
		sb.append(map.getOrDefault("J", 0) < map.getOrDefault("M", 0) ? "M" : "J");
		sb.append(map.getOrDefault("A", 0) < map.getOrDefault("N", 0) ? "N" : "A");

		return sb.toString();
    }
}