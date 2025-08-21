a, b, c = map(int, input().split())

isC = False

for i in range(a, b+1):
    if i % c == 0:
        isC = True

if isC:
    print("YES")
else:
    print("NO")        