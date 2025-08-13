li = list(map(int, input().split()))
ans = []

for i in range(len(li)):
    if li[i] != 0:
        ans.append(li[i])
    else:
        break

cnt_2 = len([i for i in ans if i % 2 == 0])
sum_2 = sum([i for i in ans if i % 2 == 0])

print(cnt_2, sum_2)