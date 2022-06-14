arr = [1, 2, 3, 1, 2, 5]

freq = {}

for i in range(len(arr)):
    if arr[i] in freq:
        freq[arr[i]] += 1
    else:
        freq[arr[i]] = 1

for i in range(len(arr)):
    if freq[arr[i]] == 1:
        print(arr[i])
        break
