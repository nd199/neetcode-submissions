class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charCount = new int[128];
        for(char c : s.toCharArray())
            charCount[c]++;

        for(char c : t.toCharArray()) 
            if(charCount[c] >= 1) 
                charCount[c]--;
            else return false;
        return true;
    }
}
