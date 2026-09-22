class Solution {
    public int missingNumber(int[] nums) {
           int maxi=nums[0];
           int mini=nums[0];
          
           for(int i=0;i<nums.length;i++){
            
            if(nums[i]>maxi){
                maxi=nums[i];
            }
            if(nums[i]<mini){
                mini=nums[i];
            }
           }
           int sum1=0;
           int sum2=0;
           for(int i=mini;i<=nums.length;i++){
            sum1+=i;
           }
           for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
           }
           return sum1-sum2;


        
    }
}