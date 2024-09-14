class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        # for i in range(len(nums)):
        #     if nums[i] in nums[i + 1:]:
        #         return True
        #     elif i < len(nums):
        #         nums.pop(i)
        #         nums.insert(i, 'a')
        # return False
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i-1] == nums[i]:
                return True
        return False


obj = Solution()
print(obj.containsDuplicate([1, 4, 2, 3, 4, 4]))
