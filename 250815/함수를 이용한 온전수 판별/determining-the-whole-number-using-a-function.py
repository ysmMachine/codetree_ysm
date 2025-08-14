a, b = map(int, input().split())

# Please write your code here.
def is_full_num(num):
    return not ((num % 2 == 0) or (num % 10 == 5) or (num % 3 == 0 and num % 9 != 0))

cnt = 0
for i in range(a, b+1):
    if is_full_num(i):
        cnt += 1

print(cnt)