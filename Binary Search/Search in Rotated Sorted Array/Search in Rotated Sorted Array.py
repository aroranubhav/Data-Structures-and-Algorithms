class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1

        while left < right:
            mid = (left + right) // 2

            curr = nums[mid]

            if curr == target:
                return mid
            elif curr < nums[left]:
                #left-mid is rotated and mid-right is sorted
                if target > curr and target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
            else:
                if target < curr and target >= nums[left]:
                    right = mid - 1
                else:
                    left = mid + 1
        
        return -1
        
#Time Complexity: O(log n)
#Space Complexity: O(1)

