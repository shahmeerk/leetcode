import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        int optimalValue;
        for(int i = 0; i < nums.length; i++){
            optimalValue = target - nums[i];
            if(hashMap.containsKey(optimalValue) && i != hashMap.get(optimalValue)){
                int[] toReturn = {i, hashMap.get(optimalValue)};
                return toReturn;
            }

        }
        return null;
    }
}
