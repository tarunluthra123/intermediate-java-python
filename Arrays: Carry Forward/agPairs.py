class Solution:
    # @param A : string
    # @return an integer
    def solve(self, A):
        n = len(A)
        c = 0
        ans = 0

        for i in range(n - 1, -1, -1):
            if A[i] == "g":
                c += 1
            else:
                ans = ans + c

        return ans
