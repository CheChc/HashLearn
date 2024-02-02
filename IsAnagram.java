public class IsAnagram
{
    public boolean isAnagram(String s, String t)
    {
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            record[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++)
        {
            record[t.charAt(j) - 'a']--;
        }
        for (int k = 0; k < 26; k++)
        {
            if (record[k] != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args)
    {

    }
}
