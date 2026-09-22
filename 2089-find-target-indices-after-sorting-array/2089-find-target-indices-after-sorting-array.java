class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[]nums1=Arrays.copyOf(nums,nums.length);
        ArrayList<Integer>arr=new ArrayList<>();

        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==target){
                arr.add(i);
            }
        }
       return arr;

        
    }
}