class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n= nums.length;
        Map<Integer,String> visited = new HashMap<>();
        for(int i =0 ;i < n; i++){
            if(visited.containsKey(nums[i]))
            return true;
            else
            visited.put(nums[i],"true");

        }
        return false;
    }
}