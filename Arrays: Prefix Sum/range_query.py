arr = [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]


def range_query(arr):
    n = len(arr)
    # Generating the prefix sum array
    prefix_sum = [0] * (n)
    prefix_sum[0] = arr[0]
    for i in range(1, n):
        prefix_sum[i] = prefix_sum[i - 1] + arr[i]

    # No of queries
    q = int(input())

    # Answering q queries
    while q > 0:
        q -= 1
        l, r = map(int, input().split())

        if l == 0:
            print(prefix_sum[r])
        else:
            print(prefix_sum[r] - prefix_sum[l - 1])


range_query(arr)
