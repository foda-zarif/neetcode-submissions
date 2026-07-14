class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for(String str:strs)
        {
            String sortedWord = sortWord(str);
            hashMap.putIfAbsent(sortedWord, new ArrayList());
            hashMap.get(sortedWord).add(str);
        }
        List<List<String>> resultList = new ArrayList();
        for(Map.Entry<String, List<String>> entry : hashMap.entrySet())
        {
            resultList.add(entry.getValue());
        }
        return resultList;
    }

    public String sortWord(String s)
    {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
