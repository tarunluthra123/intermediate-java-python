class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
        n = len(A)
        minVal = A[0]
        maxVal = A[0]
        for i in range(1, n):
            minVal = min(minVal, A[i])
            maxVal = max(maxVal, A[i])

        minIndex = -1
        maxIndex = -1
        ans = n
        for i in range(n - 1, -1, -1):
            if A[i] == minVal:
                minIndex = i
                if maxIndex != -1:
                    length = maxIndex - minIndex + 1
                    ans = min(ans, length)

            if A[i] == maxVal:
                maxIndex = i
                if minIndex != -1:
                    length = minIndex - maxIndex + 1
                    ans = min(ans, length)
        return ans
