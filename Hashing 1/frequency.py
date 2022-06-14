arr = [2, 5, 6, 1, 7, 8, 9, 2, 7, 5, 10, 8]

freq = {}

for i in range(len(arr)):
    if arr[i] in freq:
        freq[arr[i]] += 1
    else:
        freq[arr[i]] = 1

# Answer Q queries
Q = int(input())
for _ in Q:
    query = int(input())
    if query in freq:
        print(freq[query])
    else:
        print(0)
