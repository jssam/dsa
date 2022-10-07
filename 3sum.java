class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>li = new ArrayList<>();
        int i= 0;
        
        while(i<nums.length){
            int val = nums[i];
            int a =i+1 ;
            int j = nums.length-1;
            while(a<j){
                if(nums[a]+nums[j]>-val){
                    j--;
                }else if(nums[a]+nums[j]<-val){
                    a++;
                }else{
                      List<Integer>arr = new ArrayList<>();
                    arr.add(val);
                    arr.add(nums[a]);
                    arr.add(nums[j]);
                    li.add(arr);
                    int val1 = nums[a];
                    while(a<nums.length&&nums[a]==val1){
                        a++;
                    }
                    val1=  nums[j];
                    while(j>i&&nums[j]==val1)j--;
                }
            }
            while(i<nums.length&&nums[i]==val){
                i++;
            }
            
        }
        return li;
    }
}
