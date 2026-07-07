class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        List<List<String>> resultList = new ArrayList<>();

        for(int i=0; i<strs.length; i++)
        {
            char[] strArray = strs[i].toCharArray();
            Arrays.sort(strArray);
            String newStr = new String(strArray);
            hashMap.putIfAbsent(newStr, new ArrayList());
            hashMap.get(newStr).add(strs[i]);
        }

        for(Map.Entry<String,List<String>> entry: hashMap.entrySet())
        {
            resultList.add(entry.getValue());
        }
    return resultList;
    }
}
