public class max_product_subarray {
    static int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;

            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix=suffix*nums[nums.length-1-i];

            max=Math.max(max,prefix);
            max=Math.max(max,suffix);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,0,-4,-5};
        int f=maxProduct(arr);
        System.out.println(f);

    }
}
