class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int len = nums.length;
        int k=0;
        int maxones=0;
        
       for(int i=0;i<len;i++)
       {
           if(nums[i]!=1)
           {
               k=i+1;
               
               
           }
           else if(nums[i]==1){
               maxones= Math.max(maxones,(i-k+1));
           }
       }
       
        return maxones;
    }
}
