a, b = map(int, input().split())

# Please write your code here.
def is_even_sum(num):
    sum_val = 0

    while num != 0:
        sum_val += (num % 10)
        num //= 10
    
    return (sum_val % 2 == 0)

def is_prime(num):
    for i in range(2, num//2+1):
        if num % i == 0:
            return False
    return True

cnt = 0

for i in range(a, b+1):
    if is_prime(i) and is_even_sum(i):
        cnt += 1

print(cnt)