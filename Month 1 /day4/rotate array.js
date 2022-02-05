var rotate = function(nums, k) {
    var n = nums.length;
        for(var i = 0 ; i < k ; i++) {
                helper(nums , n);
        } return nums
};

function helper(nums , n) {
        let temp = nums[0]
        
        for(var i = 0 ; i < n-1 ; i++) {
                nums[i] = nums[i+1]
        }nums[n-1] = temp;
}
