#merge sort
def merge_sort(arr, tmp, p, r, k):
    global count, result
    if p<r:
        q = (p+r)//2
        merge_sort(arr, tmp, p, q, k)
        merge_sort(arr, tmp, q+1, r, k)
        merge(arr, tmp, p, q, r, k)

def merge(arr, tmp, p, q, r, k):
    global count, result
    i, j, t = p, q+1, 0

    while i <= q and j <= r:
        if arr[i] <= arr[j]:
            tmp[t] = arr[i]
            i += 1
        else:
            tmp[t] = arr[j]
            j += 1
        t += 1
        count += 1
        if count == k:
            result = tmp[t-1]

    while i <= q:
        tmp[t] = arr[i]
        i += 1
        t += 1
        count += 1
        if count == k:
            result = tmp[t - 1]

    while j <= r:
        tmp[t] = arr[j]
        j += 1
        t += 1
        count += 1
        if count == k:
            result = tmp[t - 1]

    for i in range(t):
        arr[p + i] = tmp[i]


n, k = map(int, input().split())
a = list(map(int, input().split()))

count = 0  # 저장 횟수
result = -1  # K번째 저장되는 수

tmp = [0] * n
merge_sort(a, tmp, 0, n - 1, k)
print(result if result != -1 else -1)