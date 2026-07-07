class Solution {
    public boolean isPalindrome(String s) {
      
        s = s.toLowerCase();
        s = getAdjustedString(s);
        int length = s.length();
        System.out.println(s);
        for(int i = 0; i<length/2; i++)
        {
            if(s.charAt(i) != s.charAt(length - i -1))
            return false;
        }
        return true;
    }

    public String getAdjustedString(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
            sb.append(c);
        }
        return sb.toString();
    }
 
}
