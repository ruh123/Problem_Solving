class Solution {
    public int arrayPairSum(int[] nums) {
        
        int len = nums.length;
        Arrays.sort(nums);
            
        int i=0;
        int j=i;
        int maxsum=0;
        
        while(j<len)
        {
            maxsum += Math.min(nums[i],nums[j]);
            i=i+2;
            j=j+2;
        }
        
        return maxsum;
        
    }
}
