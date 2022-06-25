public class Sum1D {
    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            output[i] = 0;
            for(int j = 0; j <= i; j++){
                output[i] +=  nums[j];
            }
        }
        return output;
    }
}
