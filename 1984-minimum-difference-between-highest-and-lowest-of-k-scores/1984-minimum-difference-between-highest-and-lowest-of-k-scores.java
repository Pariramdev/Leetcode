class Solution {
    public int minimumDifference(int[] nums, int k) {
Arrays.sort(nums);
int mini=nums[k-1]-nums[0];
int mindiff=mini;
for(int i=k;i<nums.length;i++){
    mini=nums[i]-nums[i-k+1];
    mindiff=Math.min(mini,mindiff);
}
return mindiff;
    }
}