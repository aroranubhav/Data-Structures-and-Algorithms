class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<MutableList<Int>, MutableList<String>>()

        strs.forEach { str -> 
            val count = MutableList(26) {0}
            str.forEach { c -> 
                count[c.code - 'a'.code] += 1
            }
            val tempList = map.getOrDefault(count, mutableListOf())
            tempList.add(str)
            map[count] = tempList
        }
        return map.values.toList()
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)