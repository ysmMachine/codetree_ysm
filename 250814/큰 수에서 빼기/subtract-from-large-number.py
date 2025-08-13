a, b = list(map(int, input()))
ans = a - b if a > b else b - a
print(ans)