class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int complementry = target-current;
            if(map.containsKey(complementry)) {
                return new int[]{map.get(complementry), i};
            }
            map.put(current, i);
        }
        return new int[]{-1,-1};
    }
}