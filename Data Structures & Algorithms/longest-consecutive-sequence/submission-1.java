class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<nums.length;i++)
        {
            hashSet.add(nums[i]);
        }
        int result = 1;
        for(int num: hashSet)
        {
            if(hashSet.contains(num -1))
                continue;
            
            int j = num + 1;
            int localSeqLength = 1;
            while(hashSet.contains(j))
            {
                localSeqLength++;
                j++;
            }
            result = Math.max(result, localSeqLength);
        }   
        return result;
    }
}