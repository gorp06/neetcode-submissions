class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        int maxCount=1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) continue;
            int j= nums[i]+1;
            if(j==nums[i+1]){
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }

    
        
    }
        return Math.max(maxCount, count);
    }
}

