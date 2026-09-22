class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(int[]candidates,int target,int idx,List<Integer> curr,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(candidates[i]>target)break;
            curr.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}