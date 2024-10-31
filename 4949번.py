from collections import deque

rpar = deque()

while True:

    a = input()
    
    flag = 'yes'

    if a == '.':
        break

    for b in a:

        if b == '(' or b =='[':
            rpar.append(b)
    
        elif b == ')':
            c = rpar.pop()
            if c != '(':
                flag = 'no'
                break

        elif b == ']':
            c == rpar.pop()
            if c != '[':
                flag = 'no'
                break
        else:
            continue


    
    print(flag)
    


            
        