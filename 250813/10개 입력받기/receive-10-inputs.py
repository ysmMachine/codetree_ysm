li = list(map(int, input().split()))
ans = []

for i in range(len(li)):
    if li[i] != 0:
        ans.append(li[i])
    else:
        break

print(f"{sum(ans)} {round(sum(ans)/len(ans), 1)}")