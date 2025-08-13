a, b = list(map(int, input().split()))

count_li = [0]*10

while a > 1:
    count_li[a%b] += 1
    a //= b

print(sum([i**2 for i in count_li]))