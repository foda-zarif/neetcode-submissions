class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Arrays.sort(nums);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        HashMap<Integer, Integer> hashMap = new HashMap();
        for(int i=0; i<nums.length;i++)
        {
            if(!hashMap.containsKey(nums[i]))
            {
                int newValue = hashMap.getOrDefault(nums[i]-1,0)+1;
                hashMap.put(nums[i], newValue);
                pq.add(newValue);
            } 
        }
        if(pq.isEmpty())
            return 1;
        else return pq.poll(); 
    }
}