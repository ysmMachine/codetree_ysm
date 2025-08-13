num_li = list(map(int, input().split()))
li = [0] * 10

for num in num_li:
    li[num//10] += 1

for i in range(1, 10):
    print(f"{i} - {li[i]}")