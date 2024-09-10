class Solution:
    @staticmethod
    def isPalindrome(s: str) -> bool:
        temp = ''.join(c for c in s.lower() if c.isalnum())
        return temp == temp[::-1]
