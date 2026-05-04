class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        char[] c = s.toCharArray();
        int start=0;
        int maxLen=0;
       for(int i=0;i<c.length;i++)
       {

        while(seen.contains(c[i]))
        {
           seen.remove(c[start]);
           start++;
        }
            seen.add(c[i]);
            maxLen=Math.max(maxLen,i-start+1);
        

       }

       return maxLen;
        
    }
}
