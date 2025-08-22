n = int(input())

for i in range(1, n*n+1):
    if i % n == 0:
        print(i)
        continue
    print(i, end= " ")

