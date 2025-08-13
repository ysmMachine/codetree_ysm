a, b = list(map(int, input().split()))
ans = a - b if a > b else b - a
print(ans)