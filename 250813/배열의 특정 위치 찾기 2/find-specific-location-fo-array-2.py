li = list(map(int, input().split()))

even_sum = 0
odd_sum = 0

for i in range(len(li)):
    if i % 2 == 0: odd_sum += li[i]
    else: even_sum += li[i]

ans = (odd_sum - even_sum) if odd_sum > even_sum else (even_sum - odd_sum)
print(ans)
