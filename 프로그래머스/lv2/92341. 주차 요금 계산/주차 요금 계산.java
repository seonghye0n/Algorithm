import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, LocalTime> parkingInfo = new HashMap<>();
		SortedMap<String, Integer> cumTime = new TreeMap<>();
		List<Integer> answer = new ArrayList<>();

		for (String record : records) {
			String status = record.split(" ")[2];
			String carNum = record.split(" ")[1];
			LocalTime time = LocalTime.parse(record.split(" ")[0], DateTimeFormatter.ofPattern("HH:mm"));

			if (status.equals("IN")) {
				parkingInfo.put(carNum, time);

				if (!cumTime.containsKey(carNum)) {
					cumTime.put(carNum, 0);
				}

				continue;
			}

			if (status.equals("OUT")) {
				int parkingMinute = (int)Duration.between(parkingInfo.get(carNum), time).toMinutes();
				cumTime.replace(carNum, cumTime.get(carNum) + parkingMinute);
				parkingInfo.remove(carNum);
			}
		}

		Iterator<String> parkingIterator = parkingInfo.keySet().iterator();
		while (parkingIterator.hasNext()) {
			String carNum = parkingIterator.next();
			LocalTime time = LocalTime.parse("23:59", DateTimeFormatter.ofPattern("HH:mm"));

			int parkingMinute = (int)Duration.between(parkingInfo.get(carNum), time).toMinutes();

			cumTime.replace(carNum, cumTime.get(carNum) + parkingMinute);
		}

		Iterator<String> timeIterator = cumTime.keySet().iterator();
		while (timeIterator.hasNext()) {
			answer.add(calc(fees, cumTime.get(timeIterator.next())));
		}

		return answer.stream().mapToInt(x -> x).toArray();
    }
    	
    public static int calc(int[] fees, int parkingMinute) {
		int minMinute = fees[0];
		int minPay = fees[1];
		int defaultMinute = fees[2];
		int defaultPay = fees[3];

		if (parkingMinute <= minMinute)
			return minPay;

		return minPay + (int)Math.ceil((double)(parkingMinute - minMinute) / defaultMinute) * defaultPay;
	}
}