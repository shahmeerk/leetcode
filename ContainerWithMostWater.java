public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = i + 1; j < height.length; j++){
                if(height[i] * (height.length - i) < maxArea)
                    break;
                if(height[j] >= height[i]){
                    maxArea = height[i] * (j - i) > maxArea ? height[i] * (j - i) : maxArea;
                }
                else if(height[j] < height[i]){
                    maxArea = height[j] * (j - i) > maxArea ? height[j] * (j - i) : maxArea;
                }
            }
        }
        return maxArea;

    }

//    public static void main(String args[]){
//        ContainerWithMostWater c = new ContainerWithMostWater();
//        int[] heights = {1,8,6,2,5,4,8,3,7};
//        int maxArea = c.maxArea(heights);
//        System.out.println(maxArea);
//    }
}
