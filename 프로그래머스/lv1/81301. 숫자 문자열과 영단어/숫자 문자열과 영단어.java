class Solution {
    public int solution(String s) {
        if (isInteger(s))
            return Integer.parseInt(s);

        String[] arr = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String answer = s;

        for (int j = 0; j < arr.length; j++) {
            answer = answer.replace(arr[j], Integer.toString(j));
        }

        return Integer.parseInt(answer);
    }
    
    public boolean isInteger(String s) {
		boolean flag = true;

		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			flag = false;
		}

		return flag;
	}
}