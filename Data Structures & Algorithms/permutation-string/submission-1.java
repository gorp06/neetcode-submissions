class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];

 if (s1.length() > s2.length()) return false;
        int k = s1.length();

        for(char c:s1.toCharArray()){
            c1[c-'a']++;

        }

        for(int i=0;i<k;i++){
            c2[s2.charAt(i)-'a']++;
        }

        for(int i =k;i<s2.length();i++){
            if(Arrays.equals(c1,c2))
            return true;
            else{

            c2[s2.charAt(i)-'a']++;

            c2[s2.charAt(i-k)-'a']--;

            }
        }

        return Arrays.equals(c1,c2);
      
        
        
    }
}
