class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { idx, num -> 
            val diff = target - num
            if (map.containsKey(diff)) {
                return intArrayOf(idx, map[diff]!!)
            }
            map[num] = idx
        }
        return intArrayOf(-1, -1)
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)