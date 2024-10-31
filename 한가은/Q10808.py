abc = [0]*26
s = input()

for i in s:
    abc[ord(i)-ord('a')] += 1

for i in abc:
    print(i)
