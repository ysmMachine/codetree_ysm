li = list(map(int, input().split()))
ans = []

for i in range(10):
    if li[i] != 0:
        ans.append(li[i])
    else:
        break
    
for i in range(len(ans)-1, -1, -1):
    print(ans[i], end=" ")