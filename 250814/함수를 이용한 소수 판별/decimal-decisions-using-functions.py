a, b = map(int, input().split())

# Please write your code here.
def is_prime(num):
    for i in range(2, num//2+1):
        if num % i == 0: return False
    return True

ans = 0
for i in range(a, b+1):
    if is_prime(i): ans += i

print(ans)