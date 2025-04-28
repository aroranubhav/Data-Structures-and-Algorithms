class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = defaultdict(int)

        for idx, num in enumerate(nums):
            diff = target - num

            if diff in map:
                return [idx, map[diff]]
            
            map[num] = idx
        
        return []

'''
Time Complexity: O(n)
Space Complexity: O(n)    
'''

        