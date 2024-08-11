def buildArray(nums: list[int]) -> list[int]:
    mapping = {}
    for i in range(len(nums)):
        mapping[i] = nums[i]
    for i, j in mapping.items():
        nums[i] = mapping[j]
    return nums