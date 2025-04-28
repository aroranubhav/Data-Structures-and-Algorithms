class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size == 1) return false

        val map = mutableMapOf<Int, Boolean>()

        nums.forEach { num -> 
            if (map.contains(num)) return true
            else {
                map[num] = true
            }
        }
        return false
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)