class two_Sum {
	
    public int[] twoSum(int[] nums, int target) {
        var result = new int[2];
        int step = 1;
        int i = 0;
        while (i < nums.length) {
            if (step + i >= nums.length) {
                step++;
                i = 0;
                continue;
            } else if (nums[i] + nums[step + i] == target) {
                result[0] = i;
                result[1] = i + step;
                break;
            }
            i++;
        }
        return result;
    }
}