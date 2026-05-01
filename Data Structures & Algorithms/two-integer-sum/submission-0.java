class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> left = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(left.containsKey(nums[i]))
            {
                return new int[]{left.get(nums[i]),i};
            }
            else
            left.put(target-nums[i],i);
        }
        return null;
        
    }
}
