public class BinarySearch {
    public int search(int[] nums, int target) {
        int denominator = 1;
        int index = nums.length / 2;

        if(nums[0] == target)
            return 0;
        if(nums[nums.length-1] == target){
            return nums.length-1;
        }

        while(nums[index] != target){
            denominator *= 2;
            if(denominator > nums.length){
                return -1;
            }
            if (nums[index] > target) {
                index -= index / (denominator);
            } else if (nums[index] < target) {
                index += index / (denominator);
            }
        }
        return index;
    }

//    public static void main(String[] args) {
//        BinarySearch bs = new BinarySearch();
//        int[] arr = {-1,0,5};
//        System.out.println(bs.search(arr, 5));
//    }
}
