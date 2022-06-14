def checkSubarrayWithZeroSum(arr):
    s = set()

    prefixSum = arr[0]
    s.add(prefixSum)

    for i in range(1, len(arr)):
        prefixSum += arr[i]
        s.add(prefixSum)

    if len(s) < len(arr) or (0 in s):
        return True

    return False


print(checkSubarrayWithZeroSum([2, 5, 6, -111, 10, -4]))
