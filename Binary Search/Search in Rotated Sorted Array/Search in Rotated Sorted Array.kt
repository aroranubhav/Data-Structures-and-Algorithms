class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            var mid = (left + right) / 2

            var curr = nums[mid]
            if (curr == target) {
                return mid
            } else if (curr < nums[left]) {
                //left-mid is rotated and mid-right is sorted
                if (target > curr && target <= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            } else {
                //left-mid is sorted and mid-right is rotated
                if (target < curr && target >= nums[left]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }
         }
         return -1
    }
}

//Time: O(log n)
//Space Complexity: O(1)