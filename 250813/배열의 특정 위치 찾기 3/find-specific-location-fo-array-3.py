li = list(map(int, input().split()))

idx = 0

for i in range(len(li)):
    if li[i] == 0:
        idx = i
        break

print(li[idx-3] + li[idx-2] + li[idx-1])