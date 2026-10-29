class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
       
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }
        void backtrack(int[]nums,int n, List<Integer> curr,List<List<Integer>> ans){
            ans.add(new ArrayList<>(curr));
            for(int i=n;i<nums.length;i++){
                curr.add(nums[i]);
                backtrack(nums,i+1,curr,ans);
                curr.remove(curr.size()-1);
            }
            
        
        
    
    }
}