class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        prefix[0] = nums[0];
        postfix[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length; i++)
        {
            prefix[i] = nums[i]*prefix[i-1];
        }
        for(int i=nums.length-2; i>=0 ;i--)
        {
            postfix[i] = nums[i]*postfix[i+1];
        }
        int[] result = new int[nums.length];
        for(int i=0; i<result.length; i++)
        {   int left =i-1;
            int right = i+1;
            if(left < 0)
                left = 1;
            else 
                left = prefix[left];
            if(right > result.length-1)
                right = 1;
            else 
                right = postfix[right];

            result[i]=left*right;    
        }
        return result;
    }
}  
