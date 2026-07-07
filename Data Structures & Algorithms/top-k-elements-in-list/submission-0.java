class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]result = new int[k];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
         hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[0] - a[0]);
        for(Map.Entry<Integer, Integer> entry:hashMap.entrySet())
        {
            int[] array = new int[2];
            array[0]= entry.getValue();
            array[1] = entry.getKey();
            pq.add(array);
        }

        for(int i=0;i<k; i++)
        {
            result[i]=pq.poll()[1];
        }
        return result;
    }
}