class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        map = defaultdict(int)

        for c in s:
            map[c] += 1
        
        for c in t:
            map[c] -= 1
        
        return all(value == 0 for value in map.values())

'''
Time Complexity: O(n)
Space Complexity: O(n)
'''
