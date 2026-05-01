class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    

        Map<Integer, Integer> freq = new HashMap<>();
        for( int i =0; i<nums.length;i++){
           if(freq.containsKey(nums[i]))
           freq.put(nums[i],freq.get(nums[i])+1);
           else
           freq.put(nums[i],1);
        }

      int[] result = freq.entrySet()
    .stream()
    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
    .mapToInt(Map.Entry::getKey)
    .limit(k)
    .toArray();
        return result;
    }
}
