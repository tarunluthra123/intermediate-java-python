class Solution:
    def majorityElement(self, nums):
        ele = nums[0]
        freq = 1

        for i in range(1, len(nums)):
            if freq == 0:
                ele = nums[i]
                freq = 1
            elif ele != nums[i]:
                freq -= 1
            else:
                freq += 1

        return ele
