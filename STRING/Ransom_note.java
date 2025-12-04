class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
        {
            return false;

        }
        int[] counts=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            counts[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            int idx=ransomNote.charAt(i)-'a';
            if(counts[idx]==0)
            {
                return false;
            }
            counts[idx]--;
        }    
        return true;     
    }
}