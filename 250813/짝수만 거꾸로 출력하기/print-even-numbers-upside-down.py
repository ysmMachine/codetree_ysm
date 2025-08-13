n = int(input())

li = list(map(int, input().split()))
ans = [i for i in li if i % 2 == 0][::-1]
for i in ans:
    print(i, end=" ")