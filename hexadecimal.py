class Solution:
    def toHex(self, num: int) -> str:

        if num == 0:
            return "0"

        hex_chars = "0123456789abcdef"

        # handle negative number
        if num < 0:
            num = num + 2**32

        ans = ""

        while num > 0:
            digit = num & 15
            ans = hex_chars[digit] + ans
            num = num >> 4

        return ans