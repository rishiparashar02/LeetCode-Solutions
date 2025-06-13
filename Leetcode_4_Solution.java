class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int total = a+b;
        int arr[] = new int[total];

        int j = 0;
        for(int i = 0; i<total ; i++){
            if(i<a){
                arr[i] = nums1[i];
            }
            else{
                arr[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(arr);
        if(total % 2 == 0){
            return (float) (arr[total/2] + arr[(total/2)-1])/2;
        }
        return arr[total/2];
    }
}