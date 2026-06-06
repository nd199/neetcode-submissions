class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for(int num : nums) set.add(num);
        
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                int curr = num, count = 1;
                while(set.contains(curr + 1)) {
                    curr = curr + 1;
                    count += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
