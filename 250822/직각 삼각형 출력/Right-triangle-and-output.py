n = int(input())

idx = 1

for i in range(n):
    for j in range(idx):
        print("*", end="")
    print()
    idx += 2