class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int start = 0, res = 0, maxFreq = 0;

        for (int end = 0; end < s.length(); ++end) {
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(endChar));

            while (((end - start + 1) - maxFreq) > k) {
                char startChar = s.charAt(start);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) - 1);
                    if (map.get(startChar).intValue() == 0) {
                        map.remove(startChar);
                    }
                }
                start++;
            }

            res = Math.max(end - start + 1, res);
        }

        return res;
    }
}
