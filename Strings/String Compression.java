//We cant use StringBuilder becaues it creates new String but we need to modify the existing array instead of creating new one!
class Solution {
    public int compress(char[] chars) {
        int rd = 0;
        int wrt = 0;
        while(rd<chars.length){
            char current = chars[rd];
            int count = 0;
            while(rd<chars.length && chars[rd]==current){
                rd++;
                count++;
            }
            chars[wrt] = current;
            wrt+=1;
            if(count>1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[wrt] = c;
                    wrt+=1;
                }
            }
        }
        return wrt;
    }
}
