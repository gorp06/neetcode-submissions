class Solution {
    public int[] productExceptSelf(int[] nums) {
      
        int[] res= new int[nums.length];
        int zeroCount = 0;
      
            int prod=1;
            for(int j=0;j<nums.length;j++)
            {
              
             if(nums[j]!=0)
                prod=prod*nums[j];
                else
                zeroCount++;



            }

            for(int i=0;i<nums.length;i++)
            {
            
                if(zeroCount == 0)
                res[i]=prod/nums[i];
                else if(zeroCount == 1 && nums[i]==0)
                res[i]=prod;
                else
                res[i]=0;
            }
           
        

        return res;
        
    }
}