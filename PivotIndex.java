import java.util.Arrays;

public class PivotIndex {
    public int pivotIndex(int[] nums) {

        int rightSum = -1;
        int leftSum = -2;
        int index = 0;

        while(rightSum != leftSum){
            if(index == 0){
                for (int i = 1; i < nums.length; i++){
                    rightSum += nums[i];
                }
                if(rightSum == 0)
                    return 0;
            }
            else if(index == nums.length){
                for (int i = nums.length; i >= 0; i--){
                    leftSum += nums[i];
                }
                if(leftSum == 0)
                    return 0;
            }
            else{
            }


        }

        return 0;
    }
}
