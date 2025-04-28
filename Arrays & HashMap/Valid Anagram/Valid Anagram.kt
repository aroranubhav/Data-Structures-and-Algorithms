class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val map = mutableMapOf<Char, Int>()

        s.forEach { c -> 
            map[c] = map.getOrDefault(c, 0) + 1
        } 

        t.forEach { c -> 
            map[c] = map.getOrDefault(c, 0) - 1
        }

        return map.values.all {
            it == 0
        }        
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)