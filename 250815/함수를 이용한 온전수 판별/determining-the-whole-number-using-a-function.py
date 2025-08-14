a, b = map(int, input().split())

# Please write your code here.
def is_full_num(num):
    return (num % 2 != 0) and (num % 10 != 5) and (num % 3 != 0 and num % 9 == 0)

cnt = 0
for i in range(a, b+1):
    if is_full_num(i):
        cnt += 1

print(cnt)