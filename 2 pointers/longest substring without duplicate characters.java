class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,r=0,maxlen=0;
        int[] freq = new int[128];

        while(r < s.length()){

            char rightChar = s.charAt(r);
            freq[rightChar]++;

            while(freq[rightChar] > 1 ){
                char leftChar = s.charAt(l);
                freq[leftChar]--;
                l++;
        
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
