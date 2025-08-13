n = int(input())

li = []
for i in range(n):
    li.append(int(input()))

ans = [i for i in li if i % 2 == 1 and i % 3 == 0]
print(sum(ans))