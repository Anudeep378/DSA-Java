/*sliding window*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k==0){
            return 0;
        }
        int l =0;
        int sum =0;
        double max_avg =Double.NEGATIVE_INFINITY;
        double avg;
        
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            //avg = sum/k;
            while(r-l+1>k){
                sum-=nums[l];
                l++;
            }
        if(r-l+1==k){
         avg = (double)sum/k;
         max_avg = Math.max(max_avg,avg);
        }
        }
        return max_avg;
    }
}
