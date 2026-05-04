class Solution {
    public int characterReplacement(String s, int k) {
        char[] c = s.toCharArray();
        int res =0;
        Map<Character,Integer> charMap= new HashMap<>();
        for(int i = 0;i<c.length;i++){
            charMap.merge(c[i],1,Integer::sum);
        }
        for(char cr: charMap.keySet())
        {
            int start=0;
            int count =0;
    
            for(int end=0;end<c.length;end++)
            {
                if(cr==c[end])
                count++;

                while((end-start+1)-count>k)
                {
                    if(c[start]==cr)
                    count--;
                    start++;
                }

                     res = Math.max(res, end - start + 1);
            }

        


        }

        return res;
        
        
    }
}
