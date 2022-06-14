def solve(A, B):
    n = len(A)
    pre = [0] * n

    pre[0] = A[0]
    for i in range(1, n):
        pre[i] = pre[i - 1] + A[i]

    ans = 0
	if B == n:
		ans = pre[n-1]
	else:
		ans = pre[n-1] - pre[n-B-1]
    i = 0
    j = n - B + 1
    while j < n:
        ans = max(ans, pre[i] + pre[n - 1] + pre[j - 1])
        j += 1
        i += 1
    return ans


def main():
    arr = [
        -533,
        -666,
        -500,
        169,
        724,
        478,
        358,
        -38,
        -536,
        705,
        -855,
        281,
        -173,
        961,
        -509,
        -5,
        942,
        -173,
        436,
        -609,
        -396,
        902,
        -847,
        -708,
        -618,
        421,
        -284,
        718,
        895,
        447,
        726,
        -229,
        538,
        869,
        912,
        667,
        -701,
        35,
        894,
        -297,
        811,
        322,
        -667,
        673,
        -336,
        141,
        711,
        -747,
        -132,
        547,
        644,
        -338,
        -243,
        -963,
        -141,
        -277,
        741,
        529,
        -222,
        -684,
        35,
        -810,
        842,
        -712,
        -894,
        40,
        -58,
        264,
        -352,
        446,
        805,
        890,
        -271,
        -630,
        350,
        6,
        101,
        -607,
        548,
        629,
        -377,
        -916,
        954,
        -244,
        840,
        -34,
        376,
        931,
        -692,
        -56,
        -561,
        -374,
        323,
        537,
        538,
        -882,
        -918,
        -71,
        -459,
        -167,
        115,
        -361,
        658,
        -296,
        930,
        977,
        -694,
        673,
        -614,
        21,
        -255,
        -76,
        72,
        -730,
        829,
        -223,
        573,
        97,
        -488,
        986,
        290,
        161,
        -364,
        -645,
        -233,
        655,
        574,
        -969,
        -948,
        350,
        150,
        -59,
        724,
        966,
        430,
        107,
        -809,
        -993,
        337,
        457,
        -713,
    ]
    print(solve(arr, 118))


main()
