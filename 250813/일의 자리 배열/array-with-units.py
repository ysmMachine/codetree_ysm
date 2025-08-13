li = list(map(int, input().split()))
print(li[0], li[1], end = " ")

for i in range(2, 10):
    li.append(li[i-1] + li[i-2])
    print(li[i]%10, end=" ")