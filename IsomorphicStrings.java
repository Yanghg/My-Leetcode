//use two hash table, the first for character pair(HashMap); second for character in value part of the first hash table(HashSet)
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap();
        HashSet<Character> set = new HashSet();
        for(int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i)) && !set.contains(t.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
            else if (map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else return false;
        }
        return true;
    }
}