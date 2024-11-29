from collections import deque
import sys

n = int(input())
answer = deque()
for _ in range(n):
    a = list(sys.stdin.readline().split())
    
    if a[0] == 'push_front':
        answer.appendleft(a[1])
    elif a[0] == 'push_back':
        answer.append(a[1])
    elif a[0] == 'pop_front':
        print(answer.popleft() if answer else -1)
    elif a[0] == 'pop_back':
        print(answer.pop() if answer else -1)
    elif a[0] == 'size':
        print(len(answer))
    elif a[0] == 'empty':
        print(0 if answer else 1)
    elif a[0] == 'front':
        print(answer[0] if answer else -1)
    else : # a == 'back'
        print(answer[-1] if answer else -1)