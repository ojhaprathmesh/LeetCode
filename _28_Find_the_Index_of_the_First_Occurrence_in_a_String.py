class Solution:
    @staticmethod
    def strStr(haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        return haystack.index(needle)
