class Solution {
    public int minMoves(int[] nums) {

      int mini=Integer.MAX_VALUE;
      int sum=0;
      for(int num:nums){
        mini=Math.min(num,mini);
        sum+=num;
      }
      return sum-nums.length*mini;

        
    }
}