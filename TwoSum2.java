class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int len =numbers.length;
        int i=0;
        int j=len-1;
        
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
                return new int[] {i+1,j+1};
            else if (numbers[i]+numbers[j]<target)
                i++;
            else if (numbers[i]+numbers[j]>target)
                j--;
        }
        
        
        return new int[] {-1,-1};
    }
}
