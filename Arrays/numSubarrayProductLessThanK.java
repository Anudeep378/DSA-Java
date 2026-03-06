/*sliding window*/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int l = 0;
        int product = 1;
        int count = 0;
        for (int r = 0; r < nums.length; r++) {
            product = product * nums[r];
            while ( product >= k) {
                //nums[l]--;
                product = product/nums[l];
                l++;
                // product = 1;
                // r=l;

            }
                count+=r-l+1;

        }
        return count;
    }
}
