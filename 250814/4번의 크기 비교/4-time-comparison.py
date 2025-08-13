a = int(input())
b, c, d, e = list(map(int, input().split()))

ans = 1 if a > b and a > c and a > d and a > e else 0
print(ans)