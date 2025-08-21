N = int(input())
cnt = 0

while (N < 1000):
    N = (N * 2 + 2) if N % 2 == 1 else (N * 3 + 1)
    cnt += 1

print(cnt)