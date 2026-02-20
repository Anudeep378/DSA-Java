class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length - 1;
        while (l < r) {
            while (l < r && !vowels(ch[l])) {
                l++;
            }
            while (l < r && !vowels(ch[r])) {
                r--;
            }
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;

        }
        return new String(ch);

    }

    public boolean vowels(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';

    }
}
