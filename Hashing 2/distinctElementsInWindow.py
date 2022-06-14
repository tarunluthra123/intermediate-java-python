def distinctElementsInWindow(arr, k):
    n = len(arr)
    freq = {}

    for i in range(k):
        # freq[arr[i]] = freq.get(arr[i], 0) + 1
        if arr[i] in freq:
            freq[arr[i]] += 1
        else:
            freq[arr[i]] = 1

    print(len(freq))

    i = 1
    j = k

    while i <= (n - k):
        # Subarray - [i j]

        # Remove (i-1)th element
        freq[arr[i - 1]] -= 1

        if freq[arr[i - 1]] == 0:
            freq.pop(arr[i - 1])

        # Add (j)th element
        # freq[arr[j]] = freq.get(arr[j], 0) + 1

        if arr[j] in freq:
            freq[arr[j]] += 1
        else:
            freq[arr[j]] = 1

        print(len(freq))

        i += 1
        j += 1


arr = [2, 4, 3, 8, 3, 9, 4, 9, 4, 10]
k = 4

distinctElementsInWindow(arr, k)
