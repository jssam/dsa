class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> anslist = new ArrayList<>();
        Arrays.sort(nums);
        for(int i= 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int tar = target-nums[j]-nums[i];
                int left  = j+1;
                int right= nums.length-1;
                while(left<right){
                    int check = nums[left]+nums[right];
                    if(check<tar){
                        left++;
                    }else if(tar<check){
                        right--;
                    }else{
                        List<Integer>li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[left]);
                        li.add(nums[right]);
                        anslist.add(li);
                        while(left<right&&li.get(2)==nums[left]){++left;}
                        while(left<right&&li.get(3)==nums[right]){--right;}
                    }
                    
                    
                }
                 while(j+1<nums.length&&nums[j+1]==nums[j]){++j;}
            }
         while(i+1<nums.length&&nums[i+1]==nums[i]){++i;}
        }
    return anslist;
    }
}
