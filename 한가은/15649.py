def back_tracking(arr, len, used_num):
    if len == m:
        print(*arr)
        return
    
    for i in range(1, n+1):
        if not used_num[i]:
            arr.append(i)
            used_num[i] = True
            back_tracking(arr, len + 1, used_num)
            arr.pop()
            used_num[i] = False

n, m = list(map(int, input().split()))

nums = [i+1 for i in range(n + 1)]
used_num = [False] * (n+1)
back_tracking([], 0, used_num)
