a, b, c = map(int, input().split())

isFlag = True

for i in range(a, b+1):
    if i % c == 0:
        isFlag = False

if isFlag:
    print("YES")
else:
    print("NO")