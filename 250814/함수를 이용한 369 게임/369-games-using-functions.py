a, b = map(int, input().split())

# Please write your code here.
def check_369(n):
    is_369 = False
    while n != 0:
        val = n % 10
        if val == 3 or val == 6 or val == 9:
            is_369 = True
            break
        else:
            n //= 10
    return is_369

ans = 0

for i in range(a, b+1):
    if check_369(i) or i % 3 == 0: ans += 1

print(ans)