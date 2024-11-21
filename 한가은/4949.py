import sys

while True:
    state = True
    stack = []
    commands = list(sys.stdin.readline().rstrip())
    if commands == ['.']: # command는 list이기 때문에 []리스트로 일치 판별
        break
    for char in commands:
        if char == '(':
            stack.append('(')
        elif char == '[':
            stack.append('[')
        elif char == ')':
            if stack and stack.pop() == '(':
                state = True
            else:
                state = False
                break
        elif char == ']':
            if stack and stack.pop() == '[':
                state = True
            else :
                state = False
                break
    if stack:
        state = False #stack이 비었을 때만 yes
    print('yes' if state else 'no')