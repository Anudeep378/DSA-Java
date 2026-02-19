//the problem is same like ISOMORPHIC but in this we need to consider the String words as a single unit, WE can use SPLIT function
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch1 = pattern.charAt(i);
            if (map1.containsKey(ch1)) {
                if (!map1.get(ch1).equals(words[i])) {
                    return false;
                }
            } else {
                map1.put(ch1, words[i]);
            }
            if (map2.containsKey(words[i])) {
                if (!map2.get(words[i]).equals(ch1)) {
                    return false;
                }
            } else {
                map2.put(words[i], ch1);

            }
        }
        return true;
    }
}
