li = list(map(int, input().split()))

ans = []
for i in li:
    if i == 0:
        break
    else:
        ans.append(i)

for i in ans:
    if i % 2 == 1:
        print(i + 3, end=" ")
    else:
        print(i//2, end=" ")