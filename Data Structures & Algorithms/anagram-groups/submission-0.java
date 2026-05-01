class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList();
       Map<String,List<Integer>> anagrams= new HashMap<>();

    for(int i = 0 ; i< strs.length;i++){
        
        char[] chars= strs[i].toCharArray();
        Arrays.sort(chars);
        String sort= new String(chars);
        if(anagrams.containsKey(sort))
        {
            List<Integer> index= anagrams.get(sort);
            index.add(i);
            anagrams.put(sort, index);
        }
        else{
        anagrams.put(sort,new ArrayList<>(Arrays.asList(i)));}
    }
    for(String key: anagrams.keySet()){
        List<String> ana= new ArrayList();
      for(int j :anagrams.get(key))
      ana.add(strs[j]);
      res.add(ana);
      
    }

return res;
        
    }
}
