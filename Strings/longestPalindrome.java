/* in palindrome the left and right values are in pairs so we checked by using mod and add them to length 
  and values with odd are center and we need only one so we are stopping it using boolean fnction and at last we r adding to length*/
class Solution {
    public int longestPalindrome(String s) {
        // if(s.length()==1){
        //     return 1;
        // }
        HashMap<Character, Integer> map = new HashMap<>();
        boolean odd = false;
        int length = 0;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int count : map.values()){
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count- 1;
                odd = true;
            }
        }
        if (odd) {
            length += 1;
        }
        return length;
    }
}
