class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int ithValue = nums[i];
            if(map.containsKey(ithValue) && Math.abs(map.get(ithValue)-i) <= k) {
                return true;
            } else {
                map.put(ithValue, i);
            }
        }
        return false;
    }
}