class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        if len(nums) == 1:
            return False
        
        map = defaultdict(int)
        for num in nums:
            if num in map:
                return True
            map[num] = True

        return False

'''
Time Complexity: O(n)
Space Complexity: O(n)
'''
            
