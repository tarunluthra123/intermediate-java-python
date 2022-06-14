def targetPairSum(A, target):
    hm = {}
    for i in range(len(A)):
        hm[A[i]] = hm.get(A[i], 0) + 1

    for i in range(len(A)):
        b = target - A[i]

        if b in hm:
            if A[i] == b and hm[b] >= 2:
                return True
            elif A[i] != b:
                return True

    return False


def targetPairSum2(A, target):
    s = set()
    for i in range(len(A)):
        b = target - A[i]

        if b in s:
            return True

        s.add(A[i])

    return False


A = [1, 8, 9, 4, 2]
print(targetPairSum(A, 18))
