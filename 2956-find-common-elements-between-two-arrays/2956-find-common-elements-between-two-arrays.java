class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0,count2 = 0;
        for(int i : nums1){
            for(int j : nums2){
                if(i==j) {
                    count1++;
                    break;
                }
            }
        }
        for(int i : nums2){
            for(int j : nums1){
                if(i==j) {
                    count2++;
                    break;
                }
            }
        }
        return new int[]{count1,count2};
    }
}