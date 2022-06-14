def maxSumOfSubarrayWithLengthK(arr, k):
    windowSum = 0

    for i in range(k):
        windowSum += arr[i]

    maxSum = windowSum

    for i in range(k, len(arr)):
        windowSum = windowSum + arr[i] - arr[i - k]
        maxSum = max(maxSum, windowSum)
    return maxSum


arr = [-3, 4, -2, 5, 3, -2, 8, 2, 1, 4]
ans = maxSumOfSubarrayWithLengthK(arr, 6)
print(ans)
