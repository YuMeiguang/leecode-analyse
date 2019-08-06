package com.ymg;

/**
 * @author yumg
 * @create 2019/08/06
 * @desc leecode 11
 * @since 1.0.0
 **/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] aa = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(aa));
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            System.out.println("left="+left+" left["+left+"]="+height[left]+"  right="+right+" right["+right+"]="+height[right]+ " maxArea="+maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
