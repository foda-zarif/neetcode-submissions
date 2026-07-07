class Solution {


    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs)
        {
            sb.append(String.valueOf(str.length())+ "#" +str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i = 0;
        while(i < str.length())
        {
            int poundPos = str.indexOf('#', i);
            int charCount = Integer.parseInt(str.substring(i, poundPos));
            result.add(str.substring(poundPos + 1, poundPos + 1 + charCount));
            i = poundPos + 1 + charCount;
        }
        return result;
    }
}
