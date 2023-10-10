class Solution {
    public int largestPerimeter(int[] nums) {
        int largestPerimeter = 0;

        // Sorting the array in reverse order to prioritize larger sides
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];

            if (a < b + c) {
                largestPerimeter = a + b + c;
                break; // Found the largest valid triangle, exit the loop
            }
        }

        return largestPerimeter;
    }
}