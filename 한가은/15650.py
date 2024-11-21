def backtracking (arr, start):
    if m == len(arr):
        print(*arr)
        return
    
    for i in range(start, n+1):
        arr.append(i)
        backtracking(arr, i+1)
        arr.pop()
        
    
n, m = list(map(int, input().split()))
s = 1
backtracking([], s)