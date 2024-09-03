class Solution:
    @staticmethod
    def construct2DArray(original: list[int], m: int, n: int) -> list[list[int]]:
        if m * n != len(original):
            return []

        result = [[0] * n for _ in range(m)]

        for i in range(len(original)):
            result[i // n][i % n] = original[i]

        return result


obj = Solution()
print(obj.construct2DArray([0, 1, 2, 3], 2, 2))
