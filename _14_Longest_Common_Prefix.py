# ======== My Solution (Better space complexity) ========
class Solution:
    @staticmethod
    def longestCommonPrefix(strs: list[str]) -> str:
        if not strs:
            return ""

        prefix = strs[0]

        for s in strs[1:]:
            while not s.startswith(prefix):
                prefix = prefix[:-1]
                if not prefix:
                    return ""

        return prefix

# ======== My Solution (Better space complexity) ========
# class Solution:
#     def longestCommonPrefix(self, strs: list[str]) -> str:
#         if any(s == "" for s in strs):
#             return ""
#         if not all(s[0] == strs[0][0] for s in strs):
#             return ""
#
#         minLength = min(len(s) for s in strs)
#
#         for i in range(minLength, 0, -1):
#             if all(s[0:i] == strs[0][0:i] for s in strs):
#                 return strs[0][0:i]
