class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length||j<nums2.length){
            if(i==nums1.length||j==nums2.length){
            if(i==nums1.length&&j==nums2.length){break;}
           else if(i==nums1.length){
                a.add(nums2[j]);
                j++;
            }
            else if(j==nums2.length){
                a.add(nums1[i]);
                i++;
            }
            }else{
            if(nums1[i]>nums2[j]){
               a.add(nums2[j]);
                j++;
            }
            else if(nums1[i]<nums2[j]){
               a.add(nums1[i]);
                i++;
            }
            else if(nums1[i]==nums2[j]){
               a.add(nums2[j]);
                a.add(nums1[i]);
                i++;
                j++;
            }
            }
        }
        System.out.println(a);
        if(a.size()%2==0){
            return (float)(a.get(a.size()/2)+a.get(a.size()/2-1))/2;
        }
        else{
            return a.get(a.size()/2);
        }
 }
}
