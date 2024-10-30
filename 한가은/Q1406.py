from sys import stdin

left = list(input())
right = []

order = int(input())

for i in range(order):
    key = list(stdin.readline().split())
     
    if key[0] == 'L' and left:
        right.append(left.pop())

    elif key[0] == 'D' and right:
        left.append(right.pop())
    
    elif key[0] == 'B' and left:
        left.pop()

    elif key[0] == 'P':
        left.append(key[1])

print(''.join(left) + ''.join(reversed(right)))
