class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hs = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int a =  target-nums[i];
            if(hs.containsKey(nums[i])){
                return new int[]{hs.get(nums[i]),i};
            }else{
                hs.put(a,i);
            }
        }
        return new int[]{-1};
    }
}
